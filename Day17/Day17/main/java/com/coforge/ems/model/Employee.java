package com.coforge.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "eid")
    @NotNull
    private int eid;

    @Column(name = "ename", length = 20, nullable = false)
    @NotBlank(message = "Employee name cannot be blank")
    private String ename;

    @Column(name = "esalary")
    @Positive
    private int esalary;

    @Column(name = "dno")
    @Positive
    private int dno;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(int eid, String ename, int esalary, int dno) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
        this.dno = dno;
    }

    // Getters and Setters
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsalary() {
        return esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid +
                ", ename=" + ename +
                ", esalary=" + esalary +
                ", dno=" + dno + "]";
    }
}