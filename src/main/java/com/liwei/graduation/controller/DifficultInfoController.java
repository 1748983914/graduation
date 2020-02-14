package com.liwei.graduation.controller;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.liwei.graduation.pojo.DifficultInfo;
import com.liwei.graduation.pojo.PartyMemberinfo;
import com.liwei.graduation.service.DiffictultInfoService;
import com.liwei.graduation.service.DifficultCondolenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/12/1 - 14:25
 */
@Controller
@RequestMapping("/info")
public class DifficultInfoController {
    @Autowired
    DiffictultInfoService diffictultInfoService;
    @Autowired
    DifficultCondolenceService difficultCondolenceService;

    //困难党员管理员的查看
    @RequestMapping("/info")
    @ResponseBody
    public PageInfo<DifficultInfo> show(int page, int pageSize, String name, String flag) {
        PageInfo<DifficultInfo> all = null;
        if(StringUtil.isEmpty(flag)){
            flag="1";
        }
        switch (flag) {
            case "daishenpi":
                all = diffictultInfoService.finddaishenpi(page, pageSize, name);
                break;
            case "tongguo":
                all = diffictultInfoService.findtongguo(page, pageSize, name);
                break;
            case "tuihui":
                all = diffictultInfoService.findtuihui(page, pageSize, name);
                break;
            case "caogao":
                all = diffictultInfoService.findcaogao(page, pageSize, name);
                break;
            case "yitijiao":
                all = diffictultInfoService.findyitijiao(page, pageSize, name);
                break;
            case "lishi":
                all = diffictultInfoService.findlishi(page, pageSize, name);
                break;
            case "tongguotijiao":
                all = difficultCondolenceService.findAll2(page, pageSize, name);
                break;
            default:
                all = diffictultInfoService.findAll(page, pageSize, name);

        }
 /*       if (StringUtil.isEmpty(flag)) {
            all=diffictultInfoService.findAll(page, pageSize, name);
        } else if ("daishenpi".equals(flag)) {
            all=diffictultInfoService.finddaishenpi(page, pageSize, name);
        } else if ("tongguo".equals(flag)) {
            all=diffictultInfoService.findtongguo(page, pageSize, name);
        } else if ("tuihui".equals(flag)) {
            all=diffictultInfoService.findtuihui(page, pageSize, name);
        }else if ("caogao".equals(flag)) {
            all=diffictultInfoService.findcaogao(page, pageSize, name);
        }else if("yitijiao".equals(flag)){
            all=diffictultInfoService.findyitijiao(page, pageSize, name);
        }else if("lishi".equals(flag)){
            all=diffictultInfoService.findlishi(page, pageSize, name);
        }else if("tongguotijiao".equals(flag)){
            all = difficultCondolenceService.findAll2(page,pageSize,name);
        }*/


        return all;
    }

    //上级管理员的查看，只能查看待审批的
    @RequestMapping("/info1")
    @ResponseBody
    public PageInfo<DifficultInfo> show1(int page, int pageSize) {
        PageInfo<DifficultInfo> all = diffictultInfoService.findAll1(page, pageSize);
        return all;
    }


    @RequestMapping("/delinfo")
    @ResponseBody
    public String delinfo(int id) {
        diffictultInfoService.delDifficultUser(id);
        return "success";
    }

    @RequestMapping("/addinfo")
    @ResponseBody
    public String addinfo(DifficultInfo difficultInfo) {
        if ("null".equals(difficultInfo.getId() + "") || difficultInfo.getId() == null) {
            diffictultInfoService.insertDifficultUser(difficultInfo);
            return "addsuccess";
        } else {
            diffictultInfoService.modifyDifficultUser(difficultInfo);
            return "updatasuccess";
        }

    }

    //查询当前年得分的年
    @RequestMapping("/time")
    @ResponseBody
    public String time() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        return year;

    }

    //查询所有党员基本信息
    @RequestMapping("/memberinfo")
    @ResponseBody
    public PageInfo<PartyMemberinfo> Memberinfo(int page, int pageSize) {
        PageInfo<PartyMemberinfo> all = diffictultInfoService.findAllPartyMember(page, pageSize);
        return all;
    }

    //退回党员信息
    @RequestMapping("/back")
    @ResponseBody
    public String back(int id) {
        diffictultInfoService.backDifficult(id);
        return "success";
    }

    //通过党员信息
    @RequestMapping("/pass")
    @ResponseBody
    public String pass(int id) {
        diffictultInfoService.passDifficult(id);
        return "success";
    }

    //提交党员信息开始审批环节
    @RequestMapping("/submit")
    @ResponseBody
    public String submit(int id) {
        diffictultInfoService.submit(id);
        return "success";
    }
}
