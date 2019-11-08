package com.skilldistillery.mlbb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.mlbb.data.HeroDAO;
import com.skilldistillery.mlbb.entities.Hero;

public class HeroController {

	@Autowired
	private HeroDAO heroDAO;

	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "getHero.do", method = RequestMethod.GET)
	public ModelAndView getHero(@RequestParam("heroid") int heroid) {
		ModelAndView mv = new ModelAndView();

		Hero hero = heroDAO.findHeroById(heroid);

		mv.addObject("hero", hero);
		mv.setViewName("hero/show");
		return mv;
	}
	
	@RequestMapping(path = "getAllHeroes.do", method = RequestMethod.GET)
	public ModelAndView getAllHeroes() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("heroes", heroDAO.findAllHeroes());
		mv.setViewName("hero/show");
		return mv;
	}
}
