package com.skilldistillery.mlbb.data;

import java.util.List;

import com.skilldistillery.mlbb.entities.Hero;

public interface HeroDAO {

	public Hero findHeroById(int heroid);

	public List<Hero> findAllHeroes();

	Hero addNewHero(Hero hero);

	void deleteHero(int heroId);

	Hero updateHero(Hero hero, int heroId);

//	public Hero addAnImage(File image, int heroId) throws SQLException, FileNotFoundException;

//	public Hero addAnImage(byte[] image, int heroId);

}
