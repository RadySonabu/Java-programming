package tester;

import java.util.List;
import java.util.Scanner;

import model.Professor;
import serviceimpl.ProfessorServiceImpl;

public class ProfessorTester2 {
	
	static ProfessorServiceImpl psiObject = new ProfessorServiceImpl();
	static List<Professor> professorlist = psiObject.getAllProfessor();
	
	public static void main(String[] args) {
		
		 int empID;
		 String lastname;
		 String firstname;
		 String position;
		 int number;
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of employees you want to input: ");
		int numberOfInputs = scanner.nextInt();
		
		for(int x = 0; x<numberOfInputs; x++){
			System.out.println("Enter employee ID: ");
			 empID = scanner.nextInt();
			 
			 System.out.println("Enter lastname: ");
			 lastname = scanner.next();
			 
			 System.out.println("Enter firstname: ");
			 firstname = scanner.next();
			 
			 System.out.println("Enter position; ");
			 position = scanner.next();
			 
			 
			 Professor professor = new Professor(empID, lastname, firstname, position);
			 
			 professor.setEmpID(empID);
			 professor.setLastname(lastname);
			 professor.setFirstname(firstname);
			 professor.setPosition(position);
			 
			 psiObject.addProfessor(professor);
			 
			
		}
		for (Professor x : professorlist) {
			System.out.println("\nID: " + x.getEmpID());
			System.out.println("Lastname: " + x.getLastname());
			System.out.println("Firstname: " + x.getFirstname());
			System.out.println("Position: " + x.getPosition());
		}
			
		
	}
}
