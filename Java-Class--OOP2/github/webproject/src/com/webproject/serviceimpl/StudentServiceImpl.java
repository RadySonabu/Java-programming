package com.webproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.webproject.model.Student;
import com.webproject.service.StudentService;

public class StudentServiceImpl implements StudentService {

	List<Student> studentList = new ArrayList<Student>();
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);
		
	}
	public List<Student> getAllStudent(){
		return studentList;

	}
}
