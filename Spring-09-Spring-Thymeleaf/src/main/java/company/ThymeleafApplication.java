package company;

import company.bootstrap.StudentDataGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafApplication {

	public static void main(String[] args) {

		System.out.println(StudentDataGenerator.getAllStudents());

		SpringApplication.run(ThymeleafApplication.class, args);
	}

}
