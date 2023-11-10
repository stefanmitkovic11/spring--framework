package com;

import com.bootstrap.DataGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafApplication {

	public static void main(String[] args) {

		System.out.println(DataGenerator.getAllStudents());

		SpringApplication.run(ThymeleafApplication.class, args);
	}

}
