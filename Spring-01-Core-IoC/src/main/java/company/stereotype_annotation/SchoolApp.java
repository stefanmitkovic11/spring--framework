package company.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class);

        Agile agile = container.getBean(Agile.class);
        agile.getTeachingHours();

        Java java = container.getBean(Java.class);
        java.getTeachingHours();

        Spring spring = container.getBean(Spring.class);
        spring.getTeachingHours();
    }
}
