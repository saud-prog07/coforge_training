package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee(4,"Leao",35000,102);
		//session.save(employee);//Insert
		
		//session.update(employee);//Update
		
		//Select
		//Employee emp = session.get(Employee.class, 3);
		//System.out.println(emp);
		
		
		//delete
		Employee emp = session.get(Employee.class, 3);
		session.delete(emp);
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Employee Object updated");
	}

}
