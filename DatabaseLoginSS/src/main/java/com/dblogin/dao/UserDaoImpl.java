package com.dblogin.dao;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dblogin.entity.User;
import com.dblogin.repository.UserRepository;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public Optional<User> findUser(String email)throws UsernameNotFoundException {
		return userRepository.findByUserName(email);
	}


}
