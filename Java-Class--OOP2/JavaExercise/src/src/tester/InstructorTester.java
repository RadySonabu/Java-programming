package tester;

import java.util.Scanner;

import model.Instructor;

public class InstructorTester {
	public static void main(String[] args) {
		
		int empID;
		String lastname;
		String position;
		int number;
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		empID = scanner.nextInt();
		
		System.out.println("Enter lastname: ");
		lastname = scanner.next();
		
		System.out.println("Enter firstname: ");
		position = scanner.next();
		
		Instructor instructor = new Instructor(empID, lastname, position);
		
		System.out.println("\nEmployee ID: " + instructor.getEmpID() );
		System.out.println("Lastname: " + instructor.getLastname());
		System.out.println("Firstname: " +  instructor.getPosition());
		
		
		
	}
}
