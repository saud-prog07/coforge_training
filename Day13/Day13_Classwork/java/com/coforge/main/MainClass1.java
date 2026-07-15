package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.confi.BeanConfiguration;
import com.coforge.model.Customer;

public class MainClass1 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Customer customer = (Customer) context.getBean("customer1");//Loosly Coupled
		System.out.println(customer);
	
	}

}
