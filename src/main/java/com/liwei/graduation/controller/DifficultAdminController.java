package com.liwei.graduation.controller;

import com.liwei.graduation.pojo.DifficultAdmin;
import com.liwei.graduation.service.DifficultAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2019/11/29 - 13:31
 */
@Controller
@RequestMapping("/login")
public class DifficultAdminController {
    @Autowired
    DifficultAdminService difficultUserService;

    @RequestMapping("/login")
    @ResponseBody
    public DifficultAdmin login(String username, String password, String optionsRadios, HttpServletRequest request) {
        List<DifficultAdmin> all = difficultUserService.findAll();

        for (int i = 0; i < all.size(); i++) {
            if (username.equals(all.get(i).getUsername()) && password.equals(all.get(i).getPassword())&&optionsRadios.equals(all.get(i).getIdentity())) {
                request.getSession().setAttribute("user",all.get(i));
                return all.get(i);
            }
        }
        return null;
    }
}
