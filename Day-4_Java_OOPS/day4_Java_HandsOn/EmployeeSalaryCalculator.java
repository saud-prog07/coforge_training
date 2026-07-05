package com.coforge.day4.Handson;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Syed Saud", "Software Engineer", "IT", 60000);
        Employee e2 = new Employee(102, "Rahul Sharma", "Tester", "QA", 45000);
        Employee e3 = new Employee(103, "Ayesha Khan", "HR Executive", "HR", 50000);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        if (e1.getEmpId() == id) {
            e1.displayDetails();
        } 
        else if (e2.getEmpId() == id) {
            e2.displayDetails();
        } 
        else if (e3.getEmpId() == id) {
            e3.displayDetails();
        } 
        else {
            System.out.println("Employee Not Found.");
        }

        sc.close();
    }
}