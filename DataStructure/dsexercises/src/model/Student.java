package model;

public class Student {


	private int studID = 0;
	private String lastname = "";
	private String firstname = "";
	private int programID = 0;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studID, String lastname, String firstname, int programID) {
		super();
		this.studID = studID;
		this.lastname = lastname;
		this.firstname = firstname;
		this.programID = programID;
	}
	

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
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

	public int getProgramID() {
		return programID;
	}

	public void setProgramID(int programID) {
		this.programID = programID;
	}
}
