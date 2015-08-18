package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.ScorePo;
import com.dk.scorecheckdemo.po.ScorePoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScorePoMapper {
    int countByExample(ScorePoExample example);

    int deleteByExample(ScorePoExample example);

    int deleteByPrimaryKey(String scId);

    int insert(ScorePo record);

    int insertSelective(ScorePo record);

    List<ScorePo> selectByExample(ScorePoExample example);

    ScorePo selectByPrimaryKey(String scId);

    int updateByExampleSelective(@Param("record") ScorePo record, @Param("example") ScorePoExample example);

    int updateByExample(@Param("record") ScorePo record, @Param("example") ScorePoExample example);

    int updateByPrimaryKeySelective(ScorePo record);

    int updateByPrimaryKey(ScorePo record);
}