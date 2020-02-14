package com.liwei.graduation.mapper;


import com.liwei.graduation.pojo.DifficultAdmin;
import com.liwei.graduation.pojo.DifficultAdminExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DifficultAdminMapper {
    int countByExample(DifficultAdminExample example);

    int deleteByExample(DifficultAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DifficultAdmin record);

    int insertSelective(DifficultAdmin record);

    List<DifficultAdmin> selectByExample(DifficultAdminExample example);

    DifficultAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DifficultAdmin record, @Param("example") DifficultAdminExample example);

    int updateByExample(@Param("record") DifficultAdmin record, @Param("example") DifficultAdminExample example);

    int updateByPrimaryKeySelective(DifficultAdmin record);

    int updateByPrimaryKey(DifficultAdmin record);
}