package com.spring.study.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.study.service.StudyService;
import com.spring.study.vo.Login;

@Controller
public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	
	StudyService studyService;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "login.empty";
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Login login, HttpServletRequest request) {
		
		//request.getAttribute("UserId");
		System.out.println(request.getAttribute("UserId"));
		studyService.loginUser(login);
		return "index.tiles";
	}
	
	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public String card() {
		return "cards.tiles";
	}
	
	@RequestMapping(value = "/buttons", method = RequestMethod.GET)
	public String buttons() {
		return "buttons.tiles";
	
	}
	
	@RequestMapping(value = "/utilities-color", method = RequestMethod.GET)
	public String utilitiesColor() {
		return "utilities-color.tiles";
	}
	
	@RequestMapping(value = "/utilities-border", method = RequestMethod.GET)
	public String utilitiesBorder() {
		return "utilities-border.tiles";
	}
	
	@RequestMapping(value = "/utilities-animation", method = RequestMethod.GET)
	public String utilitiesAnimation() {
		return "utilities-animation.tiles";
	}
	
	@RequestMapping(value = "/utilities-other", method = RequestMethod.GET)
	public String utilitiesOther() {
		return "utilities-other.tiles";
	}
	
	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String error() {
		
		return "404.tiles";
	}
	
	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String blank() {
		
		return "blank.tiles";
	}
	
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public String charts() {
		
		return "charts.tiles";
	}
	

	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables() {
		
		return "tables.tiles";
	}
	
	
	
}



