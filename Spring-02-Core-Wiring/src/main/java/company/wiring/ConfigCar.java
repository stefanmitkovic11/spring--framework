package company.wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car() {
        Car c1 = new Car();
        c1.setMake("BMW");
        return c1;
    }

//  *********  Direct Wiring  *************
//    @Bean
//    Person person() {
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car());
//        return p;
//    }


// *********** Auto Wiring  ***********
    @Bean
//    @Autowired
    Person person(Car c) {
        Person p = new Person();
        p.setName("Mike");
        p.setCar(c);
        return p;
    }

}
