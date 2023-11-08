package com.controller;

import com.model.Gender;
import com.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping("/mentor")
    public String mentorPage(Model model){

        Mentor m1 = new Mentor("Stefan","Mitkovic",20, Gender.MALE);
        Mentor m2 = new Mentor("Samia","Smith",24, Gender.FEMALE);
        Mentor m3 = new Mentor("Walter","James",22, Gender.MALE);

        model.addAttribute("m1",m1);
        model.addAttribute("m2",m2);
        model.addAttribute("m3",m3);



        return "mentor/mentorPage.html";
    }
}
