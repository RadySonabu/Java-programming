package model;

public class Professor extends Employee {
	
	
	public Professor(int empID, String lastname, String position) {
		super(empID, lastname, position);
		// TODO Auto-generated constructor stub
	}
	//all
	public Professor() {
		super();
		
	}
	//With limitation
	public Professor(int empID, String lastname, String firstname, String position) {
		super(empID, lastname, firstname, position);
		
	}
	
	
}
