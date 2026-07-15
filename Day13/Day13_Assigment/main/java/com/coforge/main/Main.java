package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.config.BeanConfiguration;
import com.coforge.model.Student;

public class Main {
	static Main main = new Main();
	public void App1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = (Student) context.getBean("student1");
		System.out.println(student);
		student.displayStudentDetails();
	}
	public void App2() {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Student student = (Student) context.getBean("Student1");
		System.out.println(student);
		student.displayStudentDetails();
	}
	public static void main(String[] args) {
		main.App1();
		main.App2();
	}

}
