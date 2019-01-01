package service;

import java.util.List;

import model.Student;

public interface StudentService {
	
	
	//this is called a contract, process to add a student
	//The student is the model
	public void addStudent(Student student);
	
	
	
	//this is called a contract, process to store a data
	public List<Student> getAllStudents();

}