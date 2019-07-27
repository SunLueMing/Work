package com.tx.springboot_thymeleaf.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: apple
 * @date: 2019-07-27 9:37
 */
@RequestMapping("/c")
@Controller

public class ThyAction {
    @RequestMapping("tologin")
    public String tologin() {

        return "login";
    }
    @PostMapping("login")
    public String login(String code,String pwd) {

        return "menu";
    }
}
