package com.skilldistillery.mlbb.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.skilldistillery.mlbb.entities.Hero;

public interface HeroDAO {

	public Hero findHeroById(int heroid);

	public List<Hero> findAllHeroes();

	Hero addNewHero(Hero hero);

	Hero deleteHero(int heroId);

	Hero updateHero(Hero hero, int heroId);

	public Hero addAnImage(File image, int heroId) throws SQLException, FileNotFoundException;

	public Hero addAnImage(byte[] image, int heroId);

}
