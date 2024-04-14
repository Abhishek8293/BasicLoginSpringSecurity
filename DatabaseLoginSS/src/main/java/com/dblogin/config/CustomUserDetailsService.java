package com.dblogin.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dblogin.dao.UserDaoImpl;
import com.dblogin.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired 
	private UserDaoImpl userDaoImpl;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userDaoImpl.findUser(username)
				.orElseThrow(()-> new UsernameNotFoundException("User with "+username+" username is not found "));
		return new CustomUserDetails(user);
	}

}
