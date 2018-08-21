package com.diva.poc.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.diva.poc.di.service.MessageService;

@Component //marks the class as a bean so the component scanning mechanism of spring can pick it and pull into the application context 
public class MyApplication {

	//Field based dependency injection
	/*@Autowired
	private MessageService messageService;*/
	
	private MessageService messageService;
	
	//Constructor based dependency injection
	/*@Autowired
	private MyApplication(MessageService messageService){
		this.messageService = messageService;
	}*/
	
	@Autowired
	public void setMessageService(MessageService messageService){
		this.messageService = messageService;
	}
	
	public boolean processMessage(String msg, String recv){
		return this.messageService.sendMessage(msg, recv);
	}
}