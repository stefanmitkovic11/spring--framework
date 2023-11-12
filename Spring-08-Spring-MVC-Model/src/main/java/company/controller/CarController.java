package company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")           // localhost:8080/car/info?make=Honda&year=2015
    public String carInfo(@RequestParam String make, @RequestParam Integer year, Model model){

        System.out.println(make);
        System.out.println(year);


        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info.html";
    }


    @RequestMapping("/info2")           // localhost:8080/car/info?make=Honda&year=2015
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Tesla") String make, @RequestParam(value = "year",required = false,defaultValue = "2020") Integer year, Model model){

        System.out.println(make);
        System.out.println(year);


        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info.html";
    }

    @RequestMapping("/info3/{make}/{year}")           // localhost:8080/car/info/honda
    public String getCarInfo(@PathVariable(value = "make",required = false) String make,@PathVariable(value = "year", required = false) Integer year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info.html";
    }
}
