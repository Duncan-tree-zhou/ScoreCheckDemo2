package com.dk.scorecheckdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.scorecheckdemo.mapper.CoursePoMapperCustom;
import com.dk.scorecheckdemo.mapper.ScorePoMapperCustom;
import com.dk.scorecheckdemo.po.CourseGrpPo;
import com.dk.scorecheckdemo.po.CoursePo;
import com.dk.scorecheckdemo.po.ScorePoCustom;
import com.dk.scorecheckdemo.po.ScoreVo;

@Service
public class ScoreQueryService {
	
	@Autowired
	ScorePoMapperCustom scorePoMapperCustom;
	@Autowired
	CoursePoMapperCustom coursePoMapperCustom;
	
	public List<ScorePoCustom> findScoreList(ScoreVo scoreVo) throws Exception{
		return scorePoMapperCustom.findScoreList(scoreVo);	
	}
	
	public List<CoursePo> findCourseList(String std_id) throws Exception{
		return coursePoMapperCustom.findCourseList(std_id);
	}
	
	public List<CourseGrpPo> findCourseGrpList(String std_id) throws Exception{
		return coursePoMapperCustom.findCourseGrpList(std_id);
	}

}
