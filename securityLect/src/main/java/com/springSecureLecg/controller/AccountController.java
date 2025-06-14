package com.springSecureLecg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {

	@GetMapping("/accounts")
	public String checkAccounts() {
		return "Your secure Data";
	}

}
