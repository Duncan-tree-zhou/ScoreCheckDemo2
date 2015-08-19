package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.CourseGrpPo;
import com.dk.scorecheckdemo.po.CourseGrpPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseGrpPoMapper {
    int countByExample(CourseGrpPoExample example);

    int deleteByExample(CourseGrpPoExample example);

    int deleteByPrimaryKey(String cosgId);

    int insert(CourseGrpPo record);

    int insertSelective(CourseGrpPo record);

    List<CourseGrpPo> selectByExampleWithBLOBs(CourseGrpPoExample example);

    List<CourseGrpPo> selectByExample(CourseGrpPoExample example);

    CourseGrpPo selectByPrimaryKey(String cosgId);

    int updateByExampleSelective(@Param("record") CourseGrpPo record, @Param("example") CourseGrpPoExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseGrpPo record, @Param("example") CourseGrpPoExample example);

    int updateByExample(@Param("record") CourseGrpPo record, @Param("example") CourseGrpPoExample example);

    int updateByPrimaryKeySelective(CourseGrpPo record);

    int updateByPrimaryKeyWithBLOBs(CourseGrpPo record);

    int updateByPrimaryKey(CourseGrpPo record);
}