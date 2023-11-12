package company.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c = context.getBean(Car.class);
        System.out.println("Car make: "+c.getMake());

        Person p = context.getBean(Person.class);
        System.out.println("Person name: "+p.getName());

        System.out.println("Person car: "+ p.getCar());

    }
}
