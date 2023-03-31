package com.archit.FirstSpringProject;

import com.archit.FirstSpringProject.rest.funRestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
//		funRestController obj = new funRestController();
//		System.out.println(obj.getOwnername());

//		System.out.println("Server running on port");
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

}
