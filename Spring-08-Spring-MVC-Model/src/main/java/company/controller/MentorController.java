package company.controller;

import company.enums.Gender;
import company.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/mentor")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Stefan","Mitkovic",20, Gender.MALE));
        mentorList.add(new Mentor("Samia","Smith",24, Gender.FEMALE));
        mentorList.add(new Mentor("Walter","James",22, Gender.MALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list.html";
    }
}
