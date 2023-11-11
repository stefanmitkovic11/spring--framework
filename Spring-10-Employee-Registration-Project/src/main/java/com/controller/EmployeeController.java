package com.controller;

import com.bootstrap.DataGenerator;
import com.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("/register")
    public String createEmployee(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());

        return "employee/create";
    }

    @PostMapping("/list")
    public String employeeList(@ModelAttribute("employee") Employee employee, Model model) {

        DataGenerator.addEmployee(employee);

        model.addAttribute("listOfEmployees", DataGenerator.readAllEmployees());

        return "employee/list";
    }

}
