package com.springSecureLecg.bean;

public class LoginResponse {

	private String token;
	private long expiresIn;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getExpireIn() {
		return expiresIn;
	}

	public void setExpiresIn(long l) {
		this.expiresIn = l;
	}

}
