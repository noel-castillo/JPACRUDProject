package com.skilldistillery.mlbb.data;

import java.util.List;

import com.skilldistillery.mlbb.entities.Hero;

public interface HeroDAO {

	Hero findHeroById(int heroid);

	List<Hero> findAllHeroes();

}
