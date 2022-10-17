package com.skooch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//定义Controller
@Controller
public class UserController {

    //设置当前操作访问路径
    @RequestMapping("/save")
    //设置当前操作返回值类型
    @ResponseBody
    public String save() {
        System.out.println("User save...");
        return "{'module':'springmvc'}";
    }

    //设置当前操作访问路径
    @RequestMapping("/delete")
    //设置当前操作返回值类型
    @ResponseBody
    public String delete() {
        System.out.println("User delete...");
        return "{'module':'springmvc delete'}";
    }
}
