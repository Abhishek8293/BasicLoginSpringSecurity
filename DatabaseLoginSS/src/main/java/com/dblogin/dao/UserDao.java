package com.dblogin.dao;
import java.util.Optional;

import com.dblogin.entity.User;

public interface UserDao {
	
	public void saveUser(User user);
	public Optional<User> findUser(String email);

}
