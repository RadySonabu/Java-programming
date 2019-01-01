package model;

public class Employee {
	
	public Employee(int empID, String lastname, String position) {
		super();
		this.empID = empID;
		this.lastname = lastname;
		this.position = position;
	}
	public int empID = 0;
	public String lastname = "";
	public String firstname = "";
	public double salary = 0;
	public String contact_no = "";
	public String position = "";
	
	
	
	public Employee() {
		super();
		
	}
	
	public Employee(int empID, String lastname, String firstname, String position) {
		super();
		this.empID = empID;
		this.lastname = lastname;
		this.firstname = firstname;
		this.position = position;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
