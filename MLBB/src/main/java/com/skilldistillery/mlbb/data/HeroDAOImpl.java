package com.skilldistillery.mlbb.data;

import java.time.LocalDate;
import java.util.Date;
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

//	private static final String URL = "jdbc:mysql://localhost:3306/mlbb?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
//	private static String user = "blue";
//	private static String password = "blue";
//
//	static {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public Hero findHeroById(int heroId) {
		
		System.out.println(heroId);
		Hero hero = em.find(Hero.class, heroId);
		
		return hero;
		
	}
	
	@Override
	public List<Hero> findHeroByKeyword(String keyword) {

		String queryString = "SELECT h FROM Hero h WHERE h.name LIKE :keyword OR h.title LIKE :keyword ORDER BY h.name";
		List<Hero> results = em.createQuery(queryString, Hero.class).setParameter("keyword", "%" + keyword + "%").getResultList();

		return results;

	}

	@Override
	public List<Hero> findAllHeroes() {

		
		String queryString = "SELECT h FROM Hero h ORDER BY h.name";
		List<Hero> results = em.createQuery(queryString, Hero.class).getResultList();

		for (Hero element : results) {
			System.out.println(element.getName());
		}

		return results;
	}

	@Override
	public Hero addNewHero(Hero hero) {

		hero.setLastUpdate(new Date());
		em.persist(hero);
		em.flush();

		return hero;

	}

	@Override
	public void deleteHero(int heroId) {
		Hero hero = em.find(Hero.class, heroId);
		em.remove(hero);
		em.flush();
	}

	@Override
	public Hero updateHero(Hero hero, int heroId) {

		Hero updatedHero = em.find(Hero.class, heroId);
		updatedHero.setName(hero.getName());
		updatedHero.setHp(hero.getHp());
		updatedHero.setMana(hero.getMana());
		updatedHero.setBackstory(hero.getBackstory());
		updatedHero.setTitle(hero.getTitle());
		updatedHero.setSpecialties(hero.getSpecialties());
		updatedHero.setMovementSpeed(hero.getMovementSpeed());
		updatedHero.setPhysicalAttack(hero.getPhysicalAttack());
		updatedHero.setMagicPower(hero.getMagicPower());
		updatedHero.setArmor(hero.getArmor());
		updatedHero.setMagicResistance(hero.getMagicResistance());
		updatedHero.setAttackSpeed(hero.getAttackSpeed());
		updatedHero.setHpRegen(hero.getHpRegen());
		updatedHero.setManaRegen(hero.getManaRegen());
		updatedHero.setLastUpdate(new Date()) ;

		em.flush();

		return updatedHero;
	}



//	@Override
//	public Hero addAnImage(File image, int heroId) throws SQLException, FileNotFoundException {
//
//		Hero updatedHero = em.find(Hero.class, heroId);
//		Connection conn = null;
//		try {
//			FileInputStream in = new FileInputStream(image);
//			conn = DriverManager.getConnection(URL, user, password);
//			System.out.println("Connection established......");
//			PreparedStatement pstmt = conn.prepareStatement("UPDATE Hero SET image=? WHERE id = ?");
//			pstmt.setBinaryStream(1, in);
//			pstmt.setInt(2, heroId);
//			// Executing the statement
//			int updateCount = pstmt.executeUpdate();
//			System.out.println("Record inserted......");
//			conn.commit();
//
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//			if (conn != null) {
//				try {
//					conn.rollback();
//				} catch (SQLException sqle2) {
//					System.err.println("Error trying to rollback");
//				}
//			}
//			return updatedHero;
//		}
//		return updatedHero;
//
//	}
//
//	@Override
//	public Hero addAnImage(byte[] image, int heroId) {
//		Hero updatedHero = em.find(Hero.class, heroId);
//		Connection conn = null;
//		try {
//			conn = DriverManager.getConnection(URL, user, password);
//			System.out.println("Connection established......");
//			PreparedStatement pstmt = conn.prepareStatement("UPDATE Hero SET image=? WHERE id = ?");
//			pstmt.setBytes(1, image);
//			pstmt.setInt(2, heroId);
//			// Executing the statement
//			int updateCount = pstmt.executeUpdate();
//			System.out.println("Record inserted......");
//			conn.commit();
//
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//			if (conn != null) {
//				try {
//					conn.rollback();
//				} catch (SQLException sqle2) {
//					System.err.println("Error trying to rollback");
//				}
//			}
//			return updatedHero;
//		}
//		return updatedHero;
//	}
}
