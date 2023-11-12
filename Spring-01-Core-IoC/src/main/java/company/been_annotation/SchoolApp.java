package company.been_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigApp2.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        ft.createAccount();


        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();


//        PartTimeMentor p1 = container.getBean("p1",PartTimeMentor.class);
//        p1.createAccount();

        PartTimeMentor p2 = container.getBean("p2",PartTimeMentor.class);
        p2.createAccount();


        System.out.println(container.getBean("fullTimeMentor"));

        System.out.println(container.getBean("str"));


        String str = container.getBean(String.class);
        System.out.println(str);


        Integer i = container.getBean(Integer.class);
        System.out.println(i);





    }
}
