package com.dk.scorecheckdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.scorecheckdemo.mapper.StudentPoMapperCustom;
import com.dk.scorecheckdemo.po.StudentPoCustom;

@Service
public class StudentService {
	
	@Autowired
	StudentPoMapperCustom studentPoMapperCustom;
	
	public StudentPoCustom getStudentInfo(String stdId) throws Exception{
		
		return studentPoMapperCustom.getStudentInfo(stdId);
		
	}
	

}
