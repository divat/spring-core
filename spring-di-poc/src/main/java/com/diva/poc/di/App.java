package com.diva.poc.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.diva.poc.di.config.DIConfiguration;
import com.diva.poc.di.consumer.MyApplication;

/**
 * Hello world!
 * Spring IOC resolves dependency via DI.
 * Spring IOC is responsible for injecting dependencies 
 * through either constructor or setter injection
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = ctx.getBean(MyApplication.class);
        
        app.processMessage("Hey diva", "dhiva23@gmail.com");
        
        ctx.close();
    }
}
