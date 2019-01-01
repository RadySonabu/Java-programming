package serviceimpl;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import service.StudentService;

	
	
public class StudentServiceImpl implements StudentService {
	// we put it here so that all the methods can use it
	List<Student> studentList = new ArrayList<Student>();
	
	
	//implementing the contract
	public void addStudent(Student student) {
		studentList.add(student);
		
	}
	
	//implementing the contract
	public List<Student> getAllStudents() {
		return studentList;
	}

}