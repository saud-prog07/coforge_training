package com.coforge.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Student;

@Configuration
public class BeanConfiguration {
	
	@Bean(name = "Student1")
	public Student getStudent() {
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Rahul Sharma");
		student.setAddress(getAddress());
		student.setSubjects(Arrays.asList("Java","Spring Core","Hibernate","MySQL","React"));
		Set<String> set = new HashSet<>(Arrays.asList("Communication","Problem Solving","Team Work","Java"));
		student.setSkills(set);
		Map<String,Integer> map = new HashMap();
		map.put("Java", 95);
		map.put("Spring", 90);
		map.put("Hibernate" , 88);
		map.put ("MySQL" , 92);
		map.put("React" , 85);
		student.setMarks(map);
		return student;
	}
	
	@Bean(name = "address") 
	public Address getAddress() {
		Address address = new Address();
		address.setCity("City-1");
		address.setState("State-1");
		return address;
	}
}
