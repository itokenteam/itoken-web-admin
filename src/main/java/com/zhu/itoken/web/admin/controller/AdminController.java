package com.zhu.itoken.web.admin.controller;

import com.zhu.itoken.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"","index"},method = RequestMethod.GET)
    public String login(){
        return "index";
    }
}
