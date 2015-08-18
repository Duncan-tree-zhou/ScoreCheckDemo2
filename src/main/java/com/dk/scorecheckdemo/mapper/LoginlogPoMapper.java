package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.LoginlogPo;
import com.dk.scorecheckdemo.po.LoginlogPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginlogPoMapper {
    int countByExample(LoginlogPoExample example);

    int deleteByExample(LoginlogPoExample example);

    int deleteByPrimaryKey(String llid);

    int insert(LoginlogPo record);

    int insertSelective(LoginlogPo record);

    List<LoginlogPo> selectByExample(LoginlogPoExample example);

    LoginlogPo selectByPrimaryKey(String llid);

    int updateByExampleSelective(@Param("record") LoginlogPo record, @Param("example") LoginlogPoExample example);

    int updateByExample(@Param("record") LoginlogPo record, @Param("example") LoginlogPoExample example);

    int updateByPrimaryKeySelective(LoginlogPo record);

    int updateByPrimaryKey(LoginlogPo record);
}