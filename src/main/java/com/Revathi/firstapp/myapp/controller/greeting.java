package com.Revathi.firstapp.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Revathi.firstapp.myapp.Service.CollegeService;
import com.Revathi.firstapp.myapp.Service.StudentService;

@RestController
public class greeting {
	
	@Autowired
	CollegeService college;
	
	
	@Autowired
	StudentService studentDetail;

	@GetMapping("/greet")
	public String welcome() {
		return "Welcome to the world of Revathi Shopping... get discount";
	}
	@GetMapping("/greet1")
	public String welco() {
		return "Welcome to the world of Java1";
	}
	@GetMapping("/numbers")
	public Integer number() {
		return 1;
	}
	
	@GetMapping("/collegeName")
	public String getCollege() {
		return college.getCollegeName() + " " + studentDetail.getstudName();
	}
	@GetMapping("/studDetails")
	public String studDetails() {
		return "Student Id :"+ studentDetail.getStudentId()+" Student Name :"
				+studentDetail.getstudName();
				
					
	}
	
}
