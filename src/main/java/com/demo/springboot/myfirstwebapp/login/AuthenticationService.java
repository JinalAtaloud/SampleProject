package com.demo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public Boolean authenticate(String username, String password) {
		boolean isValidUser = username.equalsIgnoreCase("jinal");
		boolean isValidPassword = username.equalsIgnoreCase("jinal");
		
		return (isValidUser && isValidPassword);
	}
}
