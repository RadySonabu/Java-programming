package serviceimpl;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	//2 class used List and ArrayList. ArrayList is a container who implements the List
	List<Student> studentList= new ArrayList<Student>();
	//This can be used in all methods inside the class
			
	public void addStudent(Student student) {
	
		
		
		//allows us to add student names, id and etc to the container
		studentList.add(student);
		
		
		
		
	}

	public List<Student> getAllStudents() {
		
		return studentList;
	}

}
