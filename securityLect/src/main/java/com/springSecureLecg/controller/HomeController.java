package com.springSecureLecg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String helloWorld()
	{

		return "Hello world";
	}

}
