package com.coforge.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int studentId;
	private String studentName;
	private Address address;
	List<String> subjects;
	Set<String> skills;
	Map<String, Integer> marks;
	public Student(int studentId, String studentName, Address address, List<String> subjects, Set<String> skills,
			Map<String, Integer> marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.subjects = subjects;
		this.skills = skills;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", subjects=" + subjects + ", skills=" + skills + ", marks=" + marks + "]";
	}

	public void displayStudentDetails() {
		System.out.println("========== Student Details ==========");
		System.out.println("Student id " + getStudentId());
		System.out.println("Student Name " + getStudentName());
		System.out.println("Student Address ");
		address.displayAddressDetails();
		System.out.println("Subjects Enrolled");
		System.out.println("-------------------------");
		for (String subject :getSubjects()) {
		    System.out.println(subject);
		}
		System.out.println();
		System.out.println("Technical Skills");
		System.out.println("-------------------------");

		for (String skill :getSkills()) {
		    System.out.println(skill);
		}
		System.out.println();
		System.out.println("Marks");
		System.out.println("-------------------------");

		for (Map.Entry<String, Integer> entry : getMarks().entrySet()) {
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
