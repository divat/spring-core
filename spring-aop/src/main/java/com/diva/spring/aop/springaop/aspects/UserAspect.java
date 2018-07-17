package com.diva.spring.aop.springaop.aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.diva.spring.aop.springaop.model.User;

@Aspect
@Component
public class UserAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAspect.class);
	
	@Before("execution(* com.diva.spring.aop.springaop.service.UserService.createUser (java.lang.String)) && args(user)")
	public void beforeUserCreation(String user){
		LOGGER.info("A request was issued to create user :: " +user);
	}
	
	@Around("execution(* com.diva.spring.aop.springaop.service.UserService.createUser (java.lang.String)) && args(user)")
	public Object aroundUserCreation(ProceedingJoinPoint proceedingJoinPoint, String user) throws Throwable{
		LOGGER.info("A request was issued to create user :: " +user);
		
		User u = (User) proceedingJoinPoint.proceed(new Object[] {user});
		u.setName(u.getName().toUpperCase());
		LOGGER.info("A request was issued to create user :: " +u.getName().toUpperCase());
		return u;
	}
	
	@After("execution(* com.diva.spring.aop.springaop.service.UserService.createUser (java.lang.String))")
	public void afterUserCreation(){
		User user = new User();
		LOGGER.info("After the creation of user :: " +user.getName());
	}
}
