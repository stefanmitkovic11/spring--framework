package company;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

//    ************  Field Injection  **************
//    @Autowired
//    OfficeHours officeHours;


//    ***********   Constructor Injection ***********
//    OfficeHours officeHours;
//
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }


    OfficeHours officeHours;

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (20 + officeHours.getHours()));
    }
}
