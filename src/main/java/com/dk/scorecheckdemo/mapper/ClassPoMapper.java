package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.ClassPo;
import com.dk.scorecheckdemo.po.ClassPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassPoMapper {
    int countByExample(ClassPoExample example);

    int deleteByExample(ClassPoExample example);

    int insert(ClassPo record);

    int insertSelective(ClassPo record);

    List<ClassPo> selectByExampleWithBLOBs(ClassPoExample example);

    List<ClassPo> selectByExample(ClassPoExample example);

    int updateByExampleSelective(@Param("record") ClassPo record, @Param("example") ClassPoExample example);

    int updateByExampleWithBLOBs(@Param("record") ClassPo record, @Param("example") ClassPoExample example);

    int updateByExample(@Param("record") ClassPo record, @Param("example") ClassPoExample example);
}