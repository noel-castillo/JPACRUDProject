package com.skilldistillery.mlbb.data;

import java.util.List;

import com.skilldistillery.mlbb.entities.Hero;

public interface HeroDAO {

	public Hero findHeroById(int heroid);

	public List<Hero> findAllHeroes();

	Hero addNewHero(Hero hero);

}
