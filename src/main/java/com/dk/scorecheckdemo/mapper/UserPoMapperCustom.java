package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.UserPo;

public interface UserPoMapperCustom {
	
	public int getMatchCount(UserPo userPo) throws Exception;
	
	public UserPo findUserByUserName(String uname) throws Exception;
	
	public void updateLoginInfo(UserPo userPo) throws Exception;

}
