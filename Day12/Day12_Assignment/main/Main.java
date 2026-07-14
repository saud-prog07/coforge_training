package com.coforge.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Course;
import com.coforge.model.Student;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session =  factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		//Student student = new Student(1,"John");
		//Student student = new Student(2,"Ronaldo");
		
		//Course courses = new Course(101,"Java");
		//Course courses = new Course(102,"Sports");
		//session.save(courses);
		
		Student student = session.get(Student.class, 1);

		Course java = session.get(Course.class, 101);
		Course sports = session.get(Course.class, 102);
		
		List<Course> list = new ArrayList<>(); 
		
		list.add(java);
		list.add(sports);
		
		student.setCourses(list);
		transaction.commit();
		session.close();
		factory.close();
	}
}
