package tester;

import java.util.Scanner;

import model.Professor;

public class ProfessorTester {
	public static void main(String[] args) {
		
		 int empID;
		 String lastname;
		 String firstname;
		 String position;
		 int number;
		 Scanner scanner = new Scanner(System.in);
		 
		 
		
		
		 
		 System.out.println("Enter employee ID: ");
		 empID = scanner.nextInt();
		 
		 System.out.println("Enter lastname: ");
		 lastname = scanner.next();
		 
		 System.out.println("Enter firstname: ");
		 firstname = scanner.next();
		 
		 System.out.println("Enter position; ");
		 position = scanner.next();
		 
		 
		 Professor professor = new Professor(empID, lastname, firstname, position);
		 /*
		 professor.getEmpID();
		 professor.getLastname();
		 professor.getFirstname();
		 professor.getPosition();
		 */
		 System.out.println("\nEmployee ID: " +   professor.getEmpID());
		 System.out.println("Lastname: " + professor.getLastname());
		 System.out.println("Firstname: " + professor.getFirstname());
		 System.out.println("Position: " +  professor.getPosition());
		 
		
		
		 
		 
	}
}
