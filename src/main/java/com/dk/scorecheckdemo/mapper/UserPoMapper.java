package com.dk.scorecheckdemo.mapper;

import com.dk.scorecheckdemo.po.UserPo;
import com.dk.scorecheckdemo.po.UserPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPoMapper {
    int countByExample(UserPoExample example);

    int deleteByExample(UserPoExample example);

    int deleteByPrimaryKey(String uid);

    int insert(UserPo record);

    int insertSelective(UserPo record);

    List<UserPo> selectByExample(UserPoExample example);

    UserPo selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") UserPo record, @Param("example") UserPoExample example);

    int updateByExample(@Param("record") UserPo record, @Param("example") UserPoExample example);

    int updateByPrimaryKeySelective(UserPo record);

    int updateByPrimaryKey(UserPo record);
}