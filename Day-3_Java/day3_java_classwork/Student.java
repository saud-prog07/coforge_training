package com.coforge.day3;

//Java bean fully 
public class Student {
	int stdid;
	private String stdname;
	private String stdemail;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stdid, String stdname, String stdemail) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdemail = stdemail;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdemail=" + stdemail + "]";
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStdemail() {
		return stdemail;
	}

	public void setStdemail(String stdemail) {
		this.stdemail = stdemail;
	}
}
