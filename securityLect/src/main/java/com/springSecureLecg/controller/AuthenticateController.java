package com.springSecureLecg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springSecureLecg.bean.LoginResponse;
import com.springSecureLecg.bean.LoginUserDao;
import com.springSecureLecg.bean.RegisterUserDao;
import com.springSecureLecg.config.JwtUtils;
import com.springSecureLecg.entity.UsersDetailsEntity;
import com.springSecureLecg.service.AuthenticationService;

@RestController
public class AuthenticateController {

	@Autowired
	private JwtUtils jwtService;

	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping("/register")
	public ResponseEntity<UsersDetailsEntity> register(@RequestBody RegisterUserDao registerUserDto) {
		UsersDetailsEntity registeredUser = authenticationService.signup(registerUserDto);

		return ResponseEntity.ok(registeredUser);
	}

	
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDao loginUserDto) {
		UsersDetailsEntity authenticatedUser = authenticationService.authenticate(loginUserDto);

		
		
		String jwtToken = jwtService.generateToken(authenticatedUser);

		LoginResponse loginResponse = new LoginResponse();

		loginResponse.setToken(jwtToken);

		loginResponse.setExpiresIn(5);

		return ResponseEntity.ok(loginResponse);
	}

}
