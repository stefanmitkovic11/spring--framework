package com;

import com.model.Comment;
import com.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		Comment comment = new Comment();
		comment.setAuthor("Stefan");
		comment.setText("Hello Spring Boot");


		ApplicationContext context = SpringApplication.run(App.class, args);

		CommentService cs = context.getBean(CommentService.class);

		cs.publishComment(comment);
	}

}
