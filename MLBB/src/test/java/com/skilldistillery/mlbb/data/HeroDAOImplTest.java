package com.skilldistillery.mlbb.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.skilldistillery.mlbb.entities.Hero;

class HeroDAOImplTest {

	private HeroDAO tester = new HeroDAOImpl();
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing Find Hero By ID")
	void test1(){
		Hero hero = tester.findHeroById(1);
		assertEquals("granger", hero.getName().toLowerCase());
	}
	
	@Test
	@DisplayName("Testing Find All Hero")
	void test2(){
		List<Hero> heroes = tester.findAllHeroes();
		assertNotEquals(0, heroes.size());
	}

}
