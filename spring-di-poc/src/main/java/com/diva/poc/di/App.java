package com.diva.poc.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.diva.poc.di.config.DIConfiguration;
import com.diva.poc.di.consumer.MyApplication;

/**
 * Hello world!
 *
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
