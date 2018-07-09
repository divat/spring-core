package com.diva.bean.scope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diva.bean.scope.component.Customer;

@RestController
public class HelloController {

	@Autowired
	private Customer customer;
	
	@RequestMapping(value = "/getNameRS")
	public String requestScope(){
		return customer.getDataRequestScope().getName();
	}
	
	@RequestMapping(value = "/updateSS")
	public String updateSessionScope(){
		customer.getDataSessionScope().setName("Session scope updated.");
		return customer.getDataSessionScope().getName();
	}
	
	@RequestMapping(value = "/getNameSS")
	public String getSessionScope(){
		return customer.getDataSessionScope().getName();
	}
}
