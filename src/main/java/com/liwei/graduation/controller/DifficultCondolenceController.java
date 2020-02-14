package com.liwei.graduation.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.liwei.graduation.pojo.DifficultCondolence;
import com.liwei.graduation.pojo.DifficultInfo;
import com.liwei.graduation.pojo.PartyLeaderinfo;
import com.liwei.graduation.service.DifficultCondolenceService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/12/1 - 20:37
 */
@Controller
@RequestMapping("/condolence")
public class DifficultCondolenceController {
    @Autowired
    DifficultCondolenceService difficultCondolenceService;
    //领导入户慰问的查看，查看所有入户慰问的领导
    @RequestMapping("/findAllLeader")
    @ResponseBody
    public List<PartyLeaderinfo> findAllLeader(String difficultpartyid){
        List<PartyLeaderinfo> all = difficultCondolenceService.findAll(difficultpartyid);
        return all;
    }
    //领导入户慰问的查看，根据困难党员id查看入户慰问的领导
    @RequestMapping("/info3")
    @ResponseBody
    public List<DifficultCondolence> info3(int id){
        List<DifficultCondolence> all = difficultCondolenceService.findByidPartyLeader(id);
        return all;
    }
    //领导入户慰问的查看，只能查看已通过的
    @RequestMapping("/info2")
    @ResponseBody
    public PageInfo<DifficultInfo> info2(int page, int pageSize){
        PageInfo<DifficultInfo> all = difficultCondolenceService.findAll2(page,pageSize,"adhajs");
        return all;
    }
    //根据困难党员id添加慰问领导
    @RequestMapping("/insertLeader")
    @ResponseBody
    public String insertLeader(String difficultpartyid, String checkboxidList){
        JSONArray objects = JSON.parseArray(checkboxidList);
        List<Integer> checkboxid=new ArrayList<Integer>();
        for (int i=0;i<objects.size();i++){
            Integer o = (Integer)objects.get(i);
            checkboxid.add(o);
        }
        difficultCondolenceService.insertLeader(difficultpartyid, checkboxid);


        return "success";
    }
    //根据困难党员id删除慰问领导
    @RequestMapping("/delLeader")
    @ResponseBody
    public String insertLeader(int id){
        difficultCondolenceService.delDifficultCondolen(id);
        return "success";
    }
    //状态改为已提交
    @RequestMapping("/submit")
    @ResponseBody
    public String submit(int id){
        difficultCondolenceService.submit(id);
        return "success";
    }
    //判断是否添加慰问领导
    @RequestMapping("/selectionLeader")
    @ResponseBody
    public int selectionLeader(int id){
        int i = difficultCondolenceService.selectionLeader(id);
        return i;
    }
}
