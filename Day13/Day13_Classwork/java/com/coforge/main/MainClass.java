package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee = (Employee) context.getBean("employee1");//Loosly Coupled
		System.out.println(employee);
		
		Employee employee2 = (Employee) context.getBean("employee2");
		System.out.println(employee2); 
	}

}
