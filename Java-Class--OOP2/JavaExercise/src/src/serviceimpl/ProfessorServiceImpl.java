package serviceimpl;

import java.util.ArrayList;
import java.util.List;

import model.Professor;
import service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
	
	List<Professor> professorlist = new ArrayList<Professor>();
	@Override
	public void addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		professorlist.add(professor);
	}

	@Override
	public List<Professor> getAllProfessor() {
		// TODO Auto-generated method stub
		return professorlist;
	}

}
