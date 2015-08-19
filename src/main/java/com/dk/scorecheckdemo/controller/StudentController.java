package com.dk.scorecheckdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dk.scorecheckdemo.po.CourseGrpPo;
import com.dk.scorecheckdemo.po.CoursePo;
import com.dk.scorecheckdemo.po.ScorePoCustom;
import com.dk.scorecheckdemo.po.ScoreVo;
import com.dk.scorecheckdemo.po.StudentPoCustom;
import com.dk.scorecheckdemo.po.StudentVo;
import com.dk.scorecheckdemo.po.UserPo;
import com.dk.scorecheckdemo.service.ScoreQueryService;
import com.dk.scorecheckdemo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	@Autowired
	ScoreQueryService scoreQueryService;

	@RequestMapping("/main/")
	public ModelAndView Main(ScoreVo scoreVo, HttpServletRequest request) throws Exception {

		ModelAndView mav= new ModelAndView("main");
		UserPo userPo = (UserPo)request.getSession().getAttribute("userPo");
		StudentPoCustom studentPoCustom = studentService.getStudentInfo(userPo.getuFnId());
		StudentVo studentVo = new StudentVo();
		if(null != studentPoCustom){
			studentVo.setStudentPoCustom(studentPoCustom);
			mav.addObject("studentVo",studentVo);
		} 
		
		if(null==scoreVo){
		//do default search
			ScorePoCustom scorePoCustom = new ScorePoCustom();
			scorePoCustom.setStId(userPo.getuFnId());
			scoreVo.setScorePoCustom(scorePoCustom);
		}else if(null==scoreVo.getScorePoCustom()){
			ScorePoCustom scorePoCustom = new ScorePoCustom();
			scorePoCustom.setStId(userPo.getuFnId());
			scoreVo.setScorePoCustom(scorePoCustom);
		}
		
		List<ScorePoCustom> scorePoCustomL = scoreQueryService.findScoreList(scoreVo);
		List<CoursePo> coursePoL = scoreQueryService.findCourseList(userPo.getuFnId());
		List<CourseGrpPo> courseGrpPoL = scoreQueryService.findCourseGrpList(userPo.getuFnId());

		mav.addObject("scorePoCustomL",scorePoCustomL);
		mav.addObject("coursePoL",coursePoL);
		mav.addObject("courseGrpPoL",courseGrpPoL);
		mav.addObject("scoreVo",scoreVo);
		
		return mav;
	}
	
	@RequestMapping("/main/queryScore/")
	public ModelAndView searchScore(ScoreVo scoreVo,
			HttpServletRequest request) throws Exception {

		ModelAndView mav= new ModelAndView("main");
		UserPo userPo = (UserPo)request.getSession().getAttribute("userPo");
		StudentPoCustom studentPoCustom = studentService.getStudentInfo(userPo.getuFnId());
		StudentVo studentVo = new StudentVo();
		if(null != studentPoCustom){
			studentVo.setStudentPoCustom(studentPoCustom);
			mav.addObject("studentVo",studentVo);
		} 
		
		if(null==scoreVo){
		//do default search
			ScorePoCustom scorePoCustom = new ScorePoCustom();
			scorePoCustom.setStId(userPo.getuFnId());
			scoreVo.setScorePoCustom(scorePoCustom);
		}else if(null==scoreVo.getScorePoCustom()){
			ScorePoCustom scorePoCustom = new ScorePoCustom();
			scorePoCustom.setStId(userPo.getuFnId());
			scoreVo.setScorePoCustom(scorePoCustom);
		}
		
		List<ScorePoCustom> scorePoCustomL = scoreQueryService.findScoreList(scoreVo);
		List<CoursePo> coursePoL = scoreQueryService.findCourseList(userPo.getuFnId());
		List<CourseGrpPo> courseGrpPoL = scoreQueryService.findCourseGrpList(userPo.getuFnId());

		mav.addObject("scorePoCustomL",scorePoCustomL);
		mav.addObject("coursePoL",coursePoL);
		mav.addObject("courseGrpPoL",courseGrpPoL);
		mav.addObject("scoreVo",scoreVo);
		
		return mav;
		
		return mav;
	}


}
