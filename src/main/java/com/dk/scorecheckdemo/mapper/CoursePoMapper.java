package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.CoursePo;
import com.dk.scorecheckdemo.po.CoursePoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursePoMapper {
    int countByExample(CoursePoExample example);

    int deleteByExample(CoursePoExample example);

    int deleteByPrimaryKey(String cosId);

    int insert(CoursePo record);

    int insertSelective(CoursePo record);

    List<CoursePo> selectByExampleWithBLOBs(CoursePoExample example);

    List<CoursePo> selectByExample(CoursePoExample example);

    CoursePo selectByPrimaryKey(String cosId);

    int updateByExampleSelective(@Param("record") CoursePo record, @Param("example") CoursePoExample example);

    int updateByExampleWithBLOBs(@Param("record") CoursePo record, @Param("example") CoursePoExample example);

    int updateByExample(@Param("record") CoursePo record, @Param("example") CoursePoExample example);

    int updateByPrimaryKeySelective(CoursePo record);

    int updateByPrimaryKeyWithBLOBs(CoursePo record);

    int updateByPrimaryKey(CoursePo record);
}