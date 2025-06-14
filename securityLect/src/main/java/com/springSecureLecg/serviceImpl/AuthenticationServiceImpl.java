package com.springSecureLecg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springSecureLecg.bean.LoginUserDao;
import com.springSecureLecg.bean.RegisterUserDao;
import com.springSecureLecg.entity.UsersDetailsEntity;
import com.springSecureLecg.repository.UsersDetailsRepo;
import com.springSecureLecg.service.AuthenticationService;


@Service
public class AuthenticationServiceImpl implements AuthenticationService{

	@Autowired
	private UsersDetailsRepo userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private AuthenticationManager authenticationManager;

	public UsersDetailsEntity signup(RegisterUserDao input) {
		UsersDetailsEntity user = new UsersDetailsEntity();

		user.setFullName(input.fullName());
		user.setEmail(input.email());
		user.setPassword(passwordEncoder.encode(input.password()));

		return userRepository.save(user);
	}
	
	
	public UsersDetailsEntity authenticate(LoginUserDao input) {
		
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.email(),
                        input.password()
                )
        );

        return userRepository.findByEmail(input.email())
                .orElseThrow();
    }

}
