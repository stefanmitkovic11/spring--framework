package com.controller;

import com.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Stefan");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        int studentID = new Random().nextInt(1000);
        model.addAttribute("id",studentID);


        List<Integer> numbers = new ArrayList<>(Arrays.asList(12,23,13,123,4,124,52,42,4242,2,52,5));
        model.addAttribute("numbers",numbers);

        Student student = new Student(1,"Stefan","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }

}
