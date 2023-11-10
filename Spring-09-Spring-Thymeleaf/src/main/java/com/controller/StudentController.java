package com.controller;

import com.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.getAllStudents());

        return "student/register";
    }

    @RequestMapping("/welcome")
    public String welcome(@RequestParam String name, Model model){

        System.out.println(name);

        return "student/welcome";
    }

}
