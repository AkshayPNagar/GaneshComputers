package com.Servlet;

public class user {

	private String fname, lname, number, email, courses, desc;

	

	public user(String fname, String lname, String number, String email, String courses, String desc) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.number = number;
		this.email = email;
		this.courses = courses;
		this.desc = desc;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourses() {
		return courses;
	}

	public void setourses(String courses) {
		this.courses = courses;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
