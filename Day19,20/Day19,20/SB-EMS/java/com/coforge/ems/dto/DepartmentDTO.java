package com.coforge.ems.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class DepartmentDTO {

	@NotNull
	private int dno;

	@NotBlank
	private String deptname;

	public DepartmentDTO(int dno, String deptname) {
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

	public DepartmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
