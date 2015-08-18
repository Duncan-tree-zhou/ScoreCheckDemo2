package com.dk.scorecheckdemo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dk.scorecheckdemo.po.UserPo;
import com.dk.scorecheckdemo.service.UserService;

@Controller
public class LoginController{

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView Login(String uname,String upassword,
			HttpServletRequest request) throws Exception {
		ModelAndView mav = null;
		UserPo userPo = (UserPo)request.getSession().getAttribute("userPo");
		if(null!=userPo){
			mav = new ModelAndView();
			mav.setViewName("redirect:/main/");
			return mav;
		}
		if(null!=uname&&null!=upassword){
			boolean isValidUser = userService.hasMatchUser(uname,upassword);
			if(!isValidUser){
				mav = new ModelAndView("login");
				mav.addObject("errorMsg", "用户名或密码错误。");
				return mav;
			}else{
				/*mav = new ModelAndView("redirect:/main/");*/
				mav = new ModelAndView("redirect:/main/");
				UserPo user = userService.findUserByUserName(uname);
				user.setLastIp(request.getRemoteAddr());
				user.setLastVisit(new Date(System.currentTimeMillis()));
				userService.loginSuccess(user);
				mav.addObject("userPo",user);
				return mav;
			}
		}
		return new ModelAndView("login");
	}

}
