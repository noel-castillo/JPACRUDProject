package com.skilldistillery.mlbb.data;

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

}
