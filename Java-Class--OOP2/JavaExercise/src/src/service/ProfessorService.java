package service;

import java.util.List;

import model.Professor;

public interface ProfessorService {
	
	public void addProfessor(Professor professor);
	
	public List<Professor> getAllProfessor();
}
