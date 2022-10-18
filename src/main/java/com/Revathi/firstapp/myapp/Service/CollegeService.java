package com.Revathi.firstapp.myapp.Service;

import org.springframework.stereotype.Component;

@Component

public class CollegeService {
	private String collegeName = "PGP COLLEGE";
	public String getCollegeName() {
		return collegeName;
	}
	

}
