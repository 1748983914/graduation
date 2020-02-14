package com.liwei.graduation.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.liwei.graduation.pojo.DifficultCondolence;
import com.liwei.graduation.pojo.DifficultInfo;
import com.liwei.graduation.pojo.PartyLeaderinfo;
import com.liwei.graduation.pojo.PartyMemberinfo;

import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/12/1 - 20:37
 */
public interface DifficultCondolenceService {
    /**
     * 查看所有领导
     *
     * @return
     */
    List<PartyLeaderinfo> findAll(String difficultpartyid);
    //增删改查
    int delDifficultCondolen(int id);
    int insertDifficultCondolen(DifficultCondolence difficultCondolence);
    int modifyDifficultCondolen(int id);
    /**
     * 根据id查询所有党员领导信息
     * @return
     */
    List<DifficultCondolence> findByidPartyLeader(int id);

    /**
     * 领导入户慰问只能查看到已通过的
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> findAll2(int page, int pageSize,String name);

    /**
     * 根据困难党员id添加慰问领导
     * @return
     */
    int insertLeader(String difficultpartyid, List<Integer> checkboxidList);
    /**
     * 状态改为提交
     * @return
     */
    int submit(int id);

    /**
     * 判断领导是否添加
     * @param id
     * @return
     */
    int selectionLeader(int id);
}
