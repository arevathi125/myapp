package com.Revathi.firstapp.myapp.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
//@Configuration
public class StudentService {
	
	//@Value("hello")
    @Value("${name.student:hi}")
	private String studName;
    
    @Value("${id.student:100}")
	private String studentId;
    
	public String getstudName() {
		return studName;
	}
	
	public String getStudentId() {
		return studentId;
	}

	
	
}
