package com.diva.spring.aop.springaop.service;

import org.springframework.stereotype.Service;

import com.diva.spring.aop.springaop.model.User;

@Service
public class UserService {

	public User createUser(String user){
		User u = new User();
		u.setName(user);
		return u;
	}
}
