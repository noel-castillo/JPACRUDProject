package com.skilldistillery.mlbb.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.mlbb.entities.Hero;

@Transactional
@Service
public class HeroDAOImpl implements HeroDAO {

	@PersistenceContext
	private EntityManager em;

	private static final String URL = "jdbc:mysql://localhost:3306/mlbb?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
	private static String user = "blue";
	private static String password = "blue";

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Hero findHeroById(int heroId) {

		System.out.println(heroId);
		Hero hero = em.find(Hero.class, heroId);

		return hero;

	}

	@Override
	public List<Hero> findAllHeroes() {

		String queryString = "SELECT h FROM Hero h";
		List<Hero> results = em.createQuery(queryString, Hero.class).getResultList();

		for (Hero element : results) {
			System.out.println(element.getName());
		}

		return results;
	}

	@Override
	public Hero addNewHero(Hero hero) {

		em.persist(hero);
		em.flush();

		return hero;

	}

	@Override
	public Hero deleteHero(int heroId) {
		Hero hero = em.find(Hero.class, heroId);
		em.remove(hero);
		em.flush();

		return hero;
	}

	@Override
	public Hero updateHero(Hero hero, int heroId) {

		Hero updatedHero = em.find(Hero.class, heroId);

		updatedHero.setName(hero.getName());
		updatedHero.setHealth(hero.getHealth());
		updatedHero.setMana(hero.getMana());
		updatedHero.setBackstory(hero.getBackstory());
		updatedHero.setImage(hero.getImage());

		em.flush();

		return updatedHero;
	}

	public void addAnImage(int heroId) {

	}

	@Override
	public Hero addAnImage(File image, int heroId) throws SQLException, FileNotFoundException {

		Hero updatedHero = em.find(Hero.class, heroId);
		Connection conn = null;
		try {
			FileInputStream in = new FileInputStream(image);
			conn = DriverManager.getConnection(URL, user, password);
			System.out.println("Connection established......");
			PreparedStatement pstmt = conn.prepareStatement("UPDATE Hero SET image=? WHERE id = ?");
			pstmt.setBinaryStream(1, in);
			pstmt.setInt(2, heroId);
			// Executing the statement
			int updateCount = pstmt.executeUpdate();
			System.out.println("Record inserted......");
			conn.commit();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException sqle2) {
					System.err.println("Error trying to rollback");
				}
			}
			return updatedHero;
		}
		return updatedHero;

	}
}
