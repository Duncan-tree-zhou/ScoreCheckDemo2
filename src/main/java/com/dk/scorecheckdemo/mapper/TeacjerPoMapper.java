package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.TeacjerPo;
import com.dk.scorecheckdemo.po.TeacjerPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacjerPoMapper {
    int countByExample(TeacjerPoExample example);

    int deleteByExample(TeacjerPoExample example);

    int deleteByPrimaryKey(String tchId);

    int insert(TeacjerPo record);

    int insertSelective(TeacjerPo record);

    List<TeacjerPo> selectByExampleWithBLOBs(TeacjerPoExample example);

    List<TeacjerPo> selectByExample(TeacjerPoExample example);

    TeacjerPo selectByPrimaryKey(String tchId);

    int updateByExampleSelective(@Param("record") TeacjerPo record, @Param("example") TeacjerPoExample example);

    int updateByExampleWithBLOBs(@Param("record") TeacjerPo record, @Param("example") TeacjerPoExample example);

    int updateByExample(@Param("record") TeacjerPo record, @Param("example") TeacjerPoExample example);

    int updateByPrimaryKeySelective(TeacjerPo record);

    int updateByPrimaryKeyWithBLOBs(TeacjerPo record);

    int updateByPrimaryKey(TeacjerPo record);
}