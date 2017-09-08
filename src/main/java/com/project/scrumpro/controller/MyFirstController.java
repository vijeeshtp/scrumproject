package com.project.scrumpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	@RequestMapping ( value={"/myhome"}, method= RequestMethod.GET)
	public ModelAndView myHome(){
		ModelAndView model= new ModelAndView();
		model.setViewName("myhome");
		return model;
	}
	
}
