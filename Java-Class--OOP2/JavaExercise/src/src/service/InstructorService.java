package service;

import java.util.List;

import model.Instructor;

public interface InstructorService {
	public void addInstructor(Instructor instructor);
	
	
	public List<Instructor> getAllInstructor();

}
