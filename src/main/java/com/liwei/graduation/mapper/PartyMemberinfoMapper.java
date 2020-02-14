package com.liwei.graduation.mapper;


import com.liwei.graduation.pojo.PartyMemberinfo;
import com.liwei.graduation.pojo.PartyMemberinfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PartyMemberinfoMapper {
    int countByExample(PartyMemberinfoExample example);

    int deleteByExample(PartyMemberinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartyMemberinfo record);

    int insertSelective(PartyMemberinfo record);

    List<PartyMemberinfo> selectByExample(PartyMemberinfoExample example);

    PartyMemberinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyMemberinfo record, @Param("example") PartyMemberinfoExample example);

    int updateByExample(@Param("record") PartyMemberinfo record, @Param("example") PartyMemberinfoExample example);

    int updateByPrimaryKeySelective(PartyMemberinfo record);

    int updateByPrimaryKey(PartyMemberinfo record);
}