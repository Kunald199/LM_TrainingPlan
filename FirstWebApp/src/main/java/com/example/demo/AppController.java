package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	@RequestMapping("courses")
	
	public String courses() {
		System.out.println("Welcome to the Application");
		return "course";
	}
	

}
