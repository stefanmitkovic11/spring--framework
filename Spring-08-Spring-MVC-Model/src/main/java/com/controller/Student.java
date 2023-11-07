package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class Student {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Stefan");
        model.addAttribute("course","MVC");

        return "student/welcome";
    }

}
