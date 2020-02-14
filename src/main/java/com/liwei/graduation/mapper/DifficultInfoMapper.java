package com.liwei.graduation.mapper;


import com.liwei.graduation.pojo.DifficultInfo;
import com.liwei.graduation.pojo.DifficultInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DifficultInfoMapper {
    int countByExample(DifficultInfoExample example);

    int deleteByExample(DifficultInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DifficultInfo record);

    int insertSelective(DifficultInfo record);

    List<DifficultInfo> selectByExample(DifficultInfoExample example);

    DifficultInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DifficultInfo record, @Param("example") DifficultInfoExample example);

    int updateByExample(@Param("record") DifficultInfo record, @Param("example") DifficultInfoExample example);

    int updateByPrimaryKeySelective(DifficultInfo record);

    int updateByPrimaryKey(DifficultInfo record);
}