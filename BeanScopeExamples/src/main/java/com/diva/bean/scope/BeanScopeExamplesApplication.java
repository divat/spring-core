package com.diva.bean.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.diva.bean.scope.config.SingletonBeanConfig;
import com.diva.bean.scope.model.PrototypeBean;
import com.diva.bean.scope.model.SingletonBean;

@SpringBootApplication
public class BeanScopeExamplesApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(SingletonBeanConfig.class);
		ctx.refresh();
		
		SingletonBean sb1 = ctx.getBean(SingletonBean.class);
		System.out.println("Singleton :: " +sb1.hashCode());
		
		SingletonBean sb2 = ctx.getBean(SingletonBean.class);
		System.out.println("Singleton :: " +sb2.hashCode());
		
		PrototypeBean pb1 = ctx.getBean(PrototypeBean.class);
		System.out.println("Prototype :: " +pb1.hashCode());
		
		PrototypeBean pb = ctx.getBean(PrototypeBean.class);
		System.out.println("Prototype :: " +pb.hashCode());
		
		SpringApplication.run(BeanScopeExamplesApplication.class, args);
		
		
		ctx.close();
	}
}
