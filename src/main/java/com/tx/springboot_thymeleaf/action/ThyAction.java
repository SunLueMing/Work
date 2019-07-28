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
    Integer sec = 2;
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
            model.addAttribute("loginname",stuName);
            return "menu";
        }
    }
    @RequestMapping("stuList")
    public String stuList(Model model,Integer fir) {
        model.addAttribute("list",iBiz.selAllStu(fir,sec));
        return "stuList";
    }
    @RequestMapping("selSomeStu")
    public String selSomeStu(Model model,Integer id) {
       model.addAttribute("recList",iBiz.selRecByStu(id));
        return "stuDetails";
    }
    @RequestMapping("recordList")
    public String recordList(Model model) {
        model.addAttribute("list",iBiz.selAllRecord());
        return "recordList";
    }

    @RequestMapping("delRecord")
    public String delRecord(Integer did) {

        return "redirect:recordList";
    }
}
