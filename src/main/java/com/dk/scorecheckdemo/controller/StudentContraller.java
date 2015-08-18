package com.dk.scorecheckdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dk.scorecheckdemo.po.ScoreVo;
import com.dk.scorecheckdemo.po.StudentPoCustom;
import com.dk.scorecheckdemo.po.StudentVo;
import com.dk.scorecheckdemo.service.StudentService;

@Controller
public class StudentContraller {
	
	@Autowired
	StudentService studentService;

	@RequestMapping("/main/")
	public ModelAndView Main(StudentVo studentVo,
			HttpServletRequest request) throws Exception {
		
		StudentPoCustom studentPoCustom = studentService.getStudentInfo(studentVo.getStudentPoCustom().getStId());
		if(null != studentPoCustom){
			studentVo.setStudentPoCustom(studentPoCustom);
		} 
		
		//do default search
		
		ModelAndView mav= new ModelAndView("main");
		mav.addObject("studentVo",studentVo);
		
		return mav;
	}
	
	@RequestMapping("/main/searchScore/")
	public ModelAndView searchScore(ScoreVo scoreVo,
			HttpServletRequest request) throws Exception {
		
		//do default search
		
		ModelAndView mav= new ModelAndView("main");
		
		return new ModelAndView("main");
	}


}
