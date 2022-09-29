package com.Revathi.firstapp.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Revathi.firstapp.myapp.Service.StudentService;
//import com.Revathi.firstapp.myapp.studentDetails.stud2Details;
import com.Revathi.firstapp.myapp.studentDetails.studDetails;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(MyappApplication.class, args);
		//StudentService s = c.getBean(StudentService.class);
		//System.out.println("name"+s.getstudName());
	}

}
