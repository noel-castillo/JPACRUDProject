package com.skilldistillery.mlbb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebFlowController {

	
	@RequestMapping(path = "coming.do")
	public String index() {
		return "coming-soon";
	}
}
