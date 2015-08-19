package com.dk.scorecheckdemo.mapper;

import java.util.List;

import com.dk.scorecheckdemo.po.ScorePoCustom;
import com.dk.scorecheckdemo.po.ScoreVo;

public interface ScorePoMapperCustom {
	
	public List<ScorePoCustom> findScoreList(ScoreVo scoreVo) throws Exception;

}
