package com.boot.controller;

import com.boot.model.UserMange;
import com.boot.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    public UserManageService userManageService;
    @RequestMapping("/index")
    String home() {
        List<UserMange> list=userManageService.findAll();
        for (UserMange item:list){
            System.out.println(item.getName());
        }
        return "index";
    }
    @RequestMapping("/addUser/{name}/{email}")
    @ResponseBody
    public String addUser(@PathVariable String name,@PathVariable String email){
        UserMange user=new UserMange();
        user.setEmail(email);
        user.setName(name);
        userManageService.saveUser(user);
        return "success";
    }

    @RequestMapping("/queryName/{name}")
    @ResponseBody
    public String queryName(@PathVariable String name){
        List<UserMange> list=userManageService.findByName(name);
        for (UserMange item:list){
            System.out.println(item.getName());
        }
        return "success";
    }
}