package com.diva.poc.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.diva.poc.di.service.EmailService;
import com.diva.poc.di.service.MessageService;

@Configuration
@ComponentScan(value = {"com.diva.poc.di.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
