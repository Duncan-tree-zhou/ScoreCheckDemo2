package com.dk.scorecheckdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.scorecheckdemo.mapper.LoginlogPoMapperCustom;
import com.dk.scorecheckdemo.mapper.UserPoMapperCustom;
import com.dk.scorecheckdemo.po.LoginlogPo;
import com.dk.scorecheckdemo.po.UserPo;

@Service
public class UserService {
	
	@Autowired
	private UserPoMapperCustom userPoMapperCustom;
	@Autowired
	private LoginlogPoMapperCustom loginlogPoMapperCustom;
	
	public boolean hasMatchUser(String uName, String password)throws Exception{
		UserPo userPo = new UserPo();
		userPo.setUname(uName);
		userPo.setUpassword(password);
		int matchCount = userPoMapperCustom.getMatchCount(userPo);
		return matchCount >0;
	}
	
	public UserPo findUserByUserName(String uName)throws Exception{
		return userPoMapperCustom.findUserByUserName(uName);
	}
	
	public void loginSuccess(UserPo userPo)throws Exception{
		
		userPo.setLogCount(1+userPo.getLogCount());
		LoginlogPo loginlogPo = new LoginlogPo();
		loginlogPo.setUid(userPo.getUid());
		loginlogPo.setUip(userPo.getLastIp());
		loginlogPo.setLogindate(userPo.getLastVisit());
		userPoMapperCustom.updateLoginInfo(userPo);
		loginlogPoMapperCustom.insertLoginLog(loginlogPo);
	}
	
	
	
	
}
