package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StudentDemoModel;

@RestController
public class StudentDemoController {

	@GetMapping("/studentInfo")
	public StudentDemoModel studentInfo() {
		
		return new StudentDemoModel(1,"Ashish", "asdfdds");		
	}

}
