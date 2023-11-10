package com.controller;

import com.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){

        model.addAttribute("mentor", new Mentor());

        List<String> batchList = Arrays.asList(
          "JD1","JD2","JD3","JD4","JD5"
        );

        model.addAttribute("batchList", batchList);

        return "mentor/register";
    }

}
