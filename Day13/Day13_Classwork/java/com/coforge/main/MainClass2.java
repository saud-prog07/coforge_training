package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Customer;
import com.coforge.model.Employee;

public class MainClass2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Customer customer = (Customer) context.getBean("customer1");//Loosly Coupled
		System.out.println(customer);
		
		Customer customer2 = (Customer) context.getBean("customer2");
		System.out.println(customer2); 
	}

}
