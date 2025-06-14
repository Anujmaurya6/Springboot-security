package com.springSecureLecg.service;

import com.springSecureLecg.bean.LoginUserDao;
import com.springSecureLecg.bean.RegisterUserDao;
import com.springSecureLecg.entity.UsersDetailsEntity;

public interface AuthenticationService {

	public UsersDetailsEntity signup(RegisterUserDao input);

	public UsersDetailsEntity authenticate(LoginUserDao input);

}
