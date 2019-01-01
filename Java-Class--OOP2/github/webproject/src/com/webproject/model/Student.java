package com.webproject.model;

public class Student {
	
	public int getStdid() {
		return studid;
	}
	public void setStdid(int stdid) {
		this.studid = stdid;
	}
	public int getProgid() {
		return progid;
	}
	public void setProgid(int progid) {
		this.progid = progid;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	
	

	public int studid;
	public Student(int studid, String lastname, String contact_number) {
		super();
		this.studid = studid;
		this.lastname = lastname;
		this.contact_number = contact_number;
	}



	public int progid;
	public String lastname;
	public String firstname;
	public String contact_number;
	public String date_registered;
	
	public String getDate_registered() {
		return date_registered;
	}
	public void setDate_registered(String date_registered) {
		this.date_registered = date_registered;
	}
	
}
