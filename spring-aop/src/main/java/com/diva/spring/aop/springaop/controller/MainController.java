package com.diva.spring.aop.springaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diva.spring.aop.springaop.model.User;
import com.diva.spring.aop.springaop.service.UserService;

@RestController
public class MainController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public User createUser(String user){
		return userService.createUser(user);
	}
}
