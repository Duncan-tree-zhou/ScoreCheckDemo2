package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.StudentPo;
import com.dk.scorecheckdemo.po.StudentPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentPoMapper {
    int countByExample(StudentPoExample example);

    int deleteByExample(StudentPoExample example);

    int deleteByPrimaryKey(String stId);

    int insert(StudentPo record);

    int insertSelective(StudentPo record);

    List<StudentPo> selectByExampleWithBLOBs(StudentPoExample example);

    List<StudentPo> selectByExample(StudentPoExample example);

    StudentPo selectByPrimaryKey(String stId);

    int updateByExampleSelective(@Param("record") StudentPo record, @Param("example") StudentPoExample example);

    int updateByExampleWithBLOBs(@Param("record") StudentPo record, @Param("example") StudentPoExample example);

    int updateByExample(@Param("record") StudentPo record, @Param("example") StudentPoExample example);

    int updateByPrimaryKeySelective(StudentPo record);

    int updateByPrimaryKeyWithBLOBs(StudentPo record);

    int updateByPrimaryKey(StudentPo record);
}