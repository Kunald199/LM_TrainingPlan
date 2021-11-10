package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppController {

	

		@RequestMapping("/hello")

		public String hello() {
			return "Simple Program to Display Hello World";
		}
}