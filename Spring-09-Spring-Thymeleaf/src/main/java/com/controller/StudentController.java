package com.controller;

import com.bootstrap.StudentDataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    //    @RequestMapping("/register")
    @GetMapping("/register")
    public String getRegister(Model model) {

        model.addAttribute("students", StudentDataGenerator.getAllStudents());

        return "student/register";
    }

    @RequestMapping("/welcome2")
    public String welcome2(@RequestParam String name, Model model) {

        return "student/welcome";
    }

    //    @RequestMapping("/welcome")
    @GetMapping("/welcome")
    public String welcome(Model model) {

        return "student/welcome";
    }

}
