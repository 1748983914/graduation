package com.liwei.graduation.mapper;


import com.liwei.graduation.pojo.PartyLeaderinfo;
import com.liwei.graduation.pojo.PartyLeaderinfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PartyLeaderinfoMapper {
    int countByExample(PartyLeaderinfoExample example);

    int deleteByExample(PartyLeaderinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartyLeaderinfo record);

    int insertSelective(PartyLeaderinfo record);

    List<PartyLeaderinfo> selectByExample(PartyLeaderinfoExample example);

    PartyLeaderinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyLeaderinfo record, @Param("example") PartyLeaderinfoExample example);

    int updateByExample(@Param("record") PartyLeaderinfo record, @Param("example") PartyLeaderinfoExample example);

    int updateByPrimaryKeySelective(PartyLeaderinfo record);

    int updateByPrimaryKey(PartyLeaderinfo record);
}