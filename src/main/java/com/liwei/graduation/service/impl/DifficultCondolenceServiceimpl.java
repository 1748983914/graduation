package com.liwei.graduation.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.liwei.graduation.mapper.DifficultCondolenceMapper;
import com.liwei.graduation.mapper.DifficultInfoMapper;
import com.liwei.graduation.mapper.PartyLeaderinfoMapper;
import com.liwei.graduation.mapper.PartyMemberinfoMapper;
import com.liwei.graduation.pojo.*;
import com.liwei.graduation.service.DifficultCondolenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/12/1 - 20:37
 */
@Service
public class DifficultCondolenceServiceimpl implements DifficultCondolenceService {
    @Autowired
    DifficultInfoMapper difficultInfoMapper;
    @Autowired
    PartyMemberinfoMapper partyMemberinfoMapper;
    @Autowired
    DifficultCondolenceMapper difficultCondolenceMapper;
    @Autowired
    PartyLeaderinfoMapper partyLeaderinfoMapper;
    @Override
    public List<PartyLeaderinfo> findAll(String difficultpartyid) {

        DifficultCondolenceExample difficultCondolenceExample = new DifficultCondolenceExample();
        DifficultCondolenceExample.Criteria difficultCondolencecriteria=difficultCondolenceExample.createCriteria();
        difficultCondolencecriteria.andDifficultpartyidEqualTo(difficultpartyid);
        List<DifficultCondolence> difficultCondolences = difficultCondolenceMapper.selectByExample(difficultCondolenceExample);
        if(difficultCondolences.size()==0){
            List<PartyLeaderinfo> partyLeaderinfos = partyLeaderinfoMapper.selectByExample(new PartyLeaderinfoExample());

            return partyLeaderinfos;
        }
        List<Integer> select=new ArrayList<>();

        for (int i=0;i<difficultCondolences.size();i++){
            String leaderid = difficultCondolences.get(i).getLeaderid();
            select.add(Integer.valueOf(leaderid));
        }
        PartyLeaderinfoExample partyLeaderinfoExample=new PartyLeaderinfoExample();
        PartyLeaderinfoExample.Criteria partyLeaderinfocriteria=partyLeaderinfoExample.createCriteria();
        partyLeaderinfocriteria.andIdNotIn(select);
        List<PartyLeaderinfo> partyLeaderinfos = partyLeaderinfoMapper.selectByExample(partyLeaderinfoExample);

        return partyLeaderinfos;
    }

    @Override
    public int delDifficultCondolen(int id) {
        difficultCondolenceMapper.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int insertDifficultCondolen(DifficultCondolence difficultCondolence) {
        return 0;
    }

    @Override
    public int modifyDifficultCondolen(int id) {
        return 0;
    }

    @Override
    public List<DifficultCondolence> findByidPartyLeader(int id) {
        DifficultCondolenceExample difficultCondolenceExample = new DifficultCondolenceExample();
        DifficultCondolenceExample.Criteria criteria=difficultCondolenceExample.createCriteria();
        criteria.andDifficultpartyidEqualTo(id+"");
        List<DifficultCondolence> difficultCondolences = difficultCondolenceMapper.selectByExample(difficultCondolenceExample);
        return difficultCondolences;
    }

    public PageInfo<DifficultInfo> findAll2(int page, int pageSize,String name){
        PageHelper.startPage(page,pageSize);
        DifficultInfoExample difficultInfoExample = new DifficultInfoExample();
        DifficultInfoExample.Criteria criteria=difficultInfoExample.createCriteria();
        List<String> select=new ArrayList<>();
        select.add("通过");
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
    public int insertLeader(String difficultpartyid, List<Integer> checkboxidList) {
        DifficultCondolence difficultCondolence = new DifficultCondolence();
        for (int i=0;i<checkboxidList.size();i++){
            PartyLeaderinfo partyLeaderinfo = partyLeaderinfoMapper.selectByPrimaryKey(checkboxidList.get(i));
            difficultCondolence.setDifficultpartyid(difficultpartyid);
            difficultCondolence.setCoodepart(partyLeaderinfo.getDepart());
            difficultCondolence.setLeadername(partyLeaderinfo.getName());
            difficultCondolence.setLeaderid(partyLeaderinfo.getId()+"");
            difficultCondolence.setContacttel(partyLeaderinfo.getNumber());
            difficultCondolenceMapper.insert(difficultCondolence);
        }
        return 0;
    }

    @Override
    public int submit(int id) {
        DifficultInfo difficultInfo = difficultInfoMapper.selectByPrimaryKey(id);
        difficultInfo.setStatusname("已提交");
        difficultInfoMapper.updateByPrimaryKey(difficultInfo);
        return 0;
    }

    @Override
    public int selectionLeader(int id) {
        DifficultCondolenceExample difficultCondolenceExample = new DifficultCondolenceExample();
        DifficultCondolenceExample.Criteria criteria=difficultCondolenceExample.createCriteria();
        criteria.andDifficultpartyidEqualTo(id+"");
        List<DifficultCondolence> difficultCondolences = difficultCondolenceMapper.selectByExample(difficultCondolenceExample);
        if(difficultCondolences.size()==0){
            return 0;
        }else{
            return 1;
        }

    }


}
