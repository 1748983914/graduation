package com.liwei.graduation.mapper;


import com.liwei.graduation.pojo.DifficultCondolence;
import com.liwei.graduation.pojo.DifficultCondolenceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DifficultCondolenceMapper {
    int countByExample(DifficultCondolenceExample example);

    int deleteByExample(DifficultCondolenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DifficultCondolence record);

    int insertSelective(DifficultCondolence record);

    List<DifficultCondolence> selectByExample(DifficultCondolenceExample example);

    DifficultCondolence selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DifficultCondolence record, @Param("example") DifficultCondolenceExample example);

    int updateByExample(@Param("record") DifficultCondolence record, @Param("example") DifficultCondolenceExample example);

    int updateByPrimaryKeySelective(DifficultCondolence record);

    int updateByPrimaryKey(DifficultCondolence record);
}