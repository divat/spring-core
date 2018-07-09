package com.diva.bean.scope.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.diva.bean.scope.model.PrototypeBean;
import com.diva.bean.scope.model.SingletonBean;

@Configuration // analog for xml file. It has the bean definitions
public class SingletonBeanConfig {

	@Bean
	@Scope(value = "singleton")
	public SingletonBean getBean(){
		return new SingletonBean();
	}
	
	@Bean
	@Scope(value = "prototype")
	public PrototypeBean getPrototypeBean(){
		return new PrototypeBean();
	}
}
