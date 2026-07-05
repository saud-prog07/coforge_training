package com.coforge.day4.Handson;

public class Employee {

    private int empId;
    private String empName;
    private String designation;
    private String department;
    private int monthlySalary;

    public Employee(int empId, String empName,
                    String designation, String department,
                    int monthlySalary) {

        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public void displayDetails() {
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Designation      : " + designation);
        System.out.println("Department       : " + department);
        System.out.println("Monthly Salary   : " + monthlySalary);
        System.out.println("Annual Salary    : " + calculateAnnualSalary());
    }
}