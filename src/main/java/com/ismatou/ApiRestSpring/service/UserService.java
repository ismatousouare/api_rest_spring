package com.ismatou.ApiRestSpring.service;

import java.util.List;

import com.ismatou.ApiRestSpring.models.User;


public interface UserService {
	
	User create(User user);
	List<User> read();
	User update(Long id, User user);
	String delete(Long id);
}
