package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

    @Autowired
    OfficeHours officeHours;

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (20 + officeHours.getHours()));
    }
}
