package com.liwei.graduation.service.impl;

import com.liwei.graduation.mapper.DifficultAdminMapper;
import com.liwei.graduation.pojo.DifficultAdmin;
import com.liwei.graduation.pojo.DifficultAdminExample;
import com.liwei.graduation.service.DifficultAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/11/29 - 13:21
 */
@Service
public class DifficultAdminServiceimpl implements DifficultAdminService {
    @Autowired
    DifficultAdminMapper difficultAdminMapper;
    @Override
    public List<DifficultAdmin> findAll() {
        DifficultAdminExample du=new DifficultAdminExample();
        List<DifficultAdmin> difficultUsers = difficultAdminMapper.selectByExample(du);
        return difficultUsers;
    }
}
