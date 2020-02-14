package com.liwei.graduation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.liwei.graduation.mapper.DifficultInfoMapper;
import com.liwei.graduation.mapper.PartyMemberinfoMapper;
import com.liwei.graduation.pojo.DifficultInfo;
import com.liwei.graduation.pojo.DifficultInfoExample;
import com.liwei.graduation.pojo.PartyMemberinfo;
import com.liwei.graduation.pojo.PartyMemberinfoExample;
import com.liwei.graduation.service.DiffictultInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/12/1 - 14:21
 */
@Service
public class DiffictultInfoServiceimpl implements DiffictultInfoService {
    @Autowired
    DifficultInfoMapper difficultInfoMapper;
    @Autowired
    PartyMemberinfoMapper partyMemberinfoMapper;
    @Override
    public PageInfo<DifficultInfo> findAll(int page , int pageSize,String name) {
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        if(StringUtil.isNotEmpty(name)){
            DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
            criteria.andNameLike("%"+name+"%");
        }
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);
        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }
    public PageInfo<DifficultInfo> findAll1(int page, int pageSize){
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("待审批");
        criteria.andStatusnameIn(select);
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);

        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }

    @Override
    public PageInfo<DifficultInfo> finddaishenpi(int page, int pageSize,String name) {
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("待审批");
        criteria.andStatusnameIn(select);
        if(StringUtil.isNotEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);

        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }
    @Override
    public PageInfo<DifficultInfo> findcaogao(int page, int pageSize,String name) {
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("草稿");
        criteria.andStatusnameIn(select);
        if(StringUtil.isNotEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);

        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }
    @Override
    public PageInfo<DifficultInfo> findtongguo(int page, int pageSize,String name) {
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("通过");
        criteria.andStatusnameIn(select);
        if(StringUtil.isNotEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);

        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }

    @Override
    public PageInfo<DifficultInfo> findyitijiao(int page, int pageSize, String name) {
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("已提交");
        criteria.andStatusnameIn(select);
        if(StringUtil.isNotEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);

        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }

    @Override
    public PageInfo<DifficultInfo> findtuihui(int page, int pageSize,String name) {
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("退回");
        criteria.andStatusnameIn(select);
        if(StringUtil.isNotEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);

        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }

    @Override
    public PageInfo<DifficultInfo> findlishi(int page, int pageSize, String name) {
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("待审批");
        select.add("草稿");
        select.add("已提交");
        criteria.andStatusnameNotIn(select);
        if(StringUtil.isNotEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        List<DifficultInfo> difficultInfo = difficultInfoMapper.selectByExample(difficultInfoExample);

        PageInfo<DifficultInfo> pageInfo = new PageInfo<DifficultInfo>(difficultInfo);
        return pageInfo;
    }


    @Override
    public List<DifficultInfo> findPending(String statusname) {
        return null;
    }

    @Override
    public int delDifficultUser(int id) {
     /*   DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        criteria.andid*/
        difficultInfoMapper.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int insertDifficultUser(DifficultInfo difficultInfo) {
        difficultInfoMapper.insert(difficultInfo);

        return 0;
    }

    @Override
    public int modifyDifficultUser(DifficultInfo difficultInfo) {
        difficultInfoMapper.updateByPrimaryKey(difficultInfo);

        return 0;
    }

    @Override
    public PageInfo<PartyMemberinfo> findAllPartyMember(int page , int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<PartyMemberinfo> partyMemberinfos = partyMemberinfoMapper.selectByExample(new PartyMemberinfoExample());
        PageInfo<PartyMemberinfo> pageInfo = new PageInfo<PartyMemberinfo>(partyMemberinfos);
        return pageInfo;
    }

    @Override
    public int backDifficult(int id) {

        DifficultInfo difficultInfo = difficultInfoMapper.selectByPrimaryKey(id);
        difficultInfo.setStatusname("退回");
        difficultInfoMapper.updateByPrimaryKey(difficultInfo);
        return 0;
    }
    @Override
    public int passDifficult(int id) {

        DifficultInfo difficultInfo = difficultInfoMapper.selectByPrimaryKey(id);
        difficultInfo.setStatusname("通过");
        difficultInfoMapper.updateByPrimaryKey(difficultInfo);
        return 0;
    }

    @Override
    public int submit(int id) {
        DifficultInfo difficultInfo = difficultInfoMapper.selectByPrimaryKey(id);
        difficultInfo.setStatusname("待审批");
        difficultInfoMapper.updateByPrimaryKey(difficultInfo);
        return 0;
    }
}
