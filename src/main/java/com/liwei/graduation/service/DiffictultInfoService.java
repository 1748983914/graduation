package com.liwei.graduation.service;

import com.github.pagehelper.PageInfo;
import com.liwei.graduation.pojo.DifficultInfo;
import com.liwei.graduation.pojo.PartyMemberinfo;

import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/12/1 - 14:20
 */
public interface DiffictultInfoService {
    /**
     * 根据管理员userid，查询所有上报的困难党员
     * @param page pageSize
     * @return
     */
    PageInfo<DifficultInfo> findAll(int page , int pageSize,String name);

    /**
     * 上级领导只能查看到不是草稿的
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> findAll1(int page, int pageSize);
    /**
     * 只查看待审批
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> finddaishenpi(int page, int pageSize,String name);
    /**
     * 只查看已通过
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> findtongguo(int page, int pageSize,String name);
    /**
     * 只查看已提交
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> findyitijiao(int page, int pageSize,String name);
    /**
     * 只查看退回
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> findtuihui(int page, int pageSize,String name);
    /**
     * 只查看历史审批
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> findlishi(int page, int pageSize,String name);
    /**
     * 只查看草稿
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo<DifficultInfo> findcaogao(int page, int pageSize,String name);
    /**
     * 根据状态查找待审批用户
     * @param statusname
     * @return
     */
    List<DifficultInfo> findPending(String statusname);
    //增删改
    int delDifficultUser(int id);
    int insertDifficultUser(DifficultInfo difficultInfo);
    int modifyDifficultUser(DifficultInfo difficultInfo);

    /**
     * 查询所有党员成员信息
     * @return
     */
    PageInfo<PartyMemberinfo> findAllPartyMember(int page,int pageSize);
    /**
     * 退回困难党员
     * @return
     */
    int backDifficult(int id);

    /**
     * 通过党员信息
     * @return
     */
    int passDifficult(int id);

    /**
     * 提交申请
     * @param id
     * @return
     */
    int submit(int id);
}
