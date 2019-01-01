package serviceimpl;

import java.util.ArrayList;
import java.util.List;

import model.Instructor;
import service.InstructorService;

public class InstructorServiceImpl implements InstructorService {

	List<Instructor> instructorlist = new ArrayList<Instructor>();
	@Override
	public void addInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		instructorlist.add(instructor);
	}

	@Override
	public List<Instructor> getAllInstructor() {
		// TODO Auto-generated method stub
		return instructorlist;
	}

}
