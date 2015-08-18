package com.dk.scorecheckdemo.mapper;

import java.util.List;

import com.dk.scorecheckdemo.po.ScorePoCustom;
import com.dk.scorecheckdemo.po.StudentPoCustom;
import com.dk.scorecheckdemo.po.StudentVo;

public interface StudentPoMapperCustom {
	
	public StudentPoCustom getStudentInfo(String stdId) throws Exception;

}
