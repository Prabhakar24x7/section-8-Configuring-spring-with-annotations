package com.prabhakar.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.prabhakar.springdemo.domain.Organization;


public class ComponentAnnotationApp {

	public static void main(String[] args) {
		
		// create the application context (container)
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
		
		Organization org = (Organization)ctx.getBean("myorg");
		System.out.println(org);
		System.out.println(org.corporateSlogan());
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
