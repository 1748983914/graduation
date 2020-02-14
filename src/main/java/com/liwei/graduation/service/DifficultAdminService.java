package com.liwei.graduation.service;

import com.liwei.graduation.pojo.DifficultAdmin;

import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/11/29 - 13:21
 */
public interface DifficultAdminService {
     /**
      * 登陆判断用户名和密码
      * @param
      * @return
      */
     List<DifficultAdmin> findAll();
}
