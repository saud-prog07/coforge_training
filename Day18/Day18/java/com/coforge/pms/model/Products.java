package com.coforge.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_products")
public class Products {
	@Id
	@Column(name = "pid")
	@NotNull
	private int pid;

	@Column(name = "pname")
	@NotBlank
	private String pname;

	@Column(name = "price")
	@NotNull
	private float price;

	@Column(name = "pquantity")
	@NotNull
	private int pquantity;

	public Products(int pid, String pname, float price, int pquantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pquantity = pquantity;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPquantity() {
		return pquantity;
	}

	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}

	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pquantity=" + pquantity + "]";
	}

}