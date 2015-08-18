package com.dk.scorecheckdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentContraller {
	
	@RequestMapping("/main/")
	public ModelAndView Main(String uname,String upassword,
			HttpServletRequest request) throws Exception {
		
		return new ModelAndView("main");
	}


}
