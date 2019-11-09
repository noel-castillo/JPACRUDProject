package com.skilldistillery.mlbb.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.mlbb.data.HeroDAO;
import com.skilldistillery.mlbb.entities.Hero;

@Controller
public class HeroController {

	@Autowired
	private HeroDAO heroDAO;

	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "getHero.do", method = RequestMethod.GET)
	public ModelAndView getHero(@RequestParam("heroId") int heroId) {
		ModelAndView mv = new ModelAndView();

		System.out.println(heroId);
		Hero hero = heroDAO.findHeroById(heroId);

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

	@RequestMapping(path = "goToCreateHero.do", method = RequestMethod.GET)
	public ModelAndView goToCreateHero(@Valid Hero hero) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("hero/create");
		return mv;
	}

	@RequestMapping(path = "addNewHero.do", method = RequestMethod.GET)
	public ModelAndView addNewHero(@Valid Hero hero) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("hero", heroDAO.addNewHero(hero));
		mv.setViewName("hero/show");
		return mv;
	}

	@RequestMapping(path = "deleteHero.do", params = "heroId", method = RequestMethod.GET)
	public ModelAndView deleteHero(int heroId) {
		ModelAndView mv = new ModelAndView();
		Hero deletedHero = heroDAO.deleteHero(heroId);
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping(path = "goToUpdateHero.do", params = "heroId", method = RequestMethod.GET)
	public ModelAndView goToUpdateHero(@Valid Hero hero, int heroId) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("oldHero", heroDAO.findHeroById(heroId));
		mv.setViewName("hero/update");
		return mv;
	}

	@RequestMapping(path = "updateHero.do", params = "heroId", method = RequestMethod.GET)
	public ModelAndView updateHero(@Valid Hero hero, int heroId) {
		ModelAndView mv = new ModelAndView();
		Hero updatedHero = heroDAO.updateHero(hero, heroId);
		mv.addObject("hero", updatedHero);
		mv.setViewName("hero/show");
		return mv;
	}
}
