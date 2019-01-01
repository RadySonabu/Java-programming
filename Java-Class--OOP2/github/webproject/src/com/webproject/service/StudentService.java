package com.webproject.service;

import java.util.List;

import com.webproject.model.Student;

public interface StudentService {

	public void addStudent(Student student);
	
	public List<Student> getAllStudent();
}
