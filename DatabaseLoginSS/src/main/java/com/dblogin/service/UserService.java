package com.dblogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dblogin.dao.UserDaoImpl;
import com.dblogin.dto.UserRegistrationDto;
import com.dblogin.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public String registerUser(UserRegistrationDto userDto) {
				User user = new User();
				user.setUserName(userDto.getUserName());
				user.setEmail(userDto.getEmail());
				user.setPassword(passwordEncoder.encode(userDto.getPassword()));
				user.setRoles(userDto.getRoles());
				userDaoImpl.saveUser(user);
		 return "user "+userDto.getUserName()+" is successfully registered";
				
	}

}
