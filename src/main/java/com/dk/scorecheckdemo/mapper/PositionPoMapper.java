package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.PositionPo;
import com.dk.scorecheckdemo.po.PositionPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionPoMapper {
    int countByExample(PositionPoExample example);

    int deleteByExample(PositionPoExample example);

    int deleteByPrimaryKey(String psnId);

    int insert(PositionPo record);

    int insertSelective(PositionPo record);

    List<PositionPo> selectByExampleWithBLOBs(PositionPoExample example);

    List<PositionPo> selectByExample(PositionPoExample example);

    PositionPo selectByPrimaryKey(String psnId);

    int updateByExampleSelective(@Param("record") PositionPo record, @Param("example") PositionPoExample example);

    int updateByExampleWithBLOBs(@Param("record") PositionPo record, @Param("example") PositionPoExample example);

    int updateByExample(@Param("record") PositionPo record, @Param("example") PositionPoExample example);

    int updateByPrimaryKeySelective(PositionPo record);

    int updateByPrimaryKeyWithBLOBs(PositionPo record);

    int updateByPrimaryKey(PositionPo record);
}