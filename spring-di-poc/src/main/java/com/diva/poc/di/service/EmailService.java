package com.diva.poc.di.service;

public class EmailService implements MessageService{

	public boolean sendMessage(String msg, String recv) {
		System.out.println("Email sent to " + recv + " with the message=" +msg);
		return true;
	}

}
