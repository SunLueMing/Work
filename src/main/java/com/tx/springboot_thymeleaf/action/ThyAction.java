package com.tx.springboot_thymeleaf.action;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.tx.springboot_thymeleaf.biz.ThyBiz;
import com.tx.springboot_thymeleaf.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @description:
 * @author: apple
 * @date: 2019-07-27 9:37
 */
@RequestMapping("/c")
@Controller

public class ThyAction {
    @Resource
    private ThyBiz iBiz;
    String stuName ;
    @RequestMapping("tologin")
    public String tologin() {

        return "login";
    }
    @PostMapping("login")
    public String login(String code, String pwd,Model model) {
        stuName = iBiz.selUserName(code, pwd);
        System.out.println(stuName);
        if ("".equals(stuName) || stuName == null) {
            model.addAttribute("sum", "用户名或密码错误");
            return "login";
        } else {
            return "menu";
        }
    }
}
