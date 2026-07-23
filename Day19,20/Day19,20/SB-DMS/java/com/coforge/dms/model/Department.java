package com.coforge.dms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_department")
public class Department {

	@Id
	@Column(name = "dno", length = 5)
	@NotNull
	private int dno;

	@Column(name = "deptname", length = 20)
	@NotBlank
	private String deptname;

	public Department(int dno, String deptname) {
		super();
		this.dno = dno;
		this.deptname = deptname;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", deptname=" + deptname + "]";
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
