package com.dk.scorecheckdemo.mapper;

import java.util.List;

import com.dk.scorecheckdemo.po.CourseGrpPo;
import com.dk.scorecheckdemo.po.CoursePo;

public interface CoursePoMapperCustom {
	
	public List<CoursePo> findCourseList(String std_id) throws Exception;
	
	public List<CourseGrpPo> findCourseGrpList(String std_id) throws Exception;
}
