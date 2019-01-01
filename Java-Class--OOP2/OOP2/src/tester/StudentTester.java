package tester;

import java.util.List;
import java.util.Scanner;

import model.Student;
import serviceimpl.StudentServiceImpl;

public class StudentTester {
	public static void main(String[] args) {
		
		//The variables
		int studentID = 0;
		String lastname = "";
		String firstname = "";
		int programID = 0;
		
		//the scanner
		Scanner scanner = new Scanner(System.in);
		
		StudentServiceImpl ssiObject = new StudentServiceImpl();
		
		System.out.println("Enter how many student you want to input! ");
		int numberOfStudent = scanner.nextInt();
		
		for(int x = 0; x <= numberOfStudent; x++){
		
		
		
		System.out.println("Enter student ID: ");
		studentID = scanner.nextInt();
		
		System.out.println("Enter last name: ");
		lastname = scanner.next();
		
		System.out.println("Enter first name: ");
		firstname = scanner.next();
		
		System.out.println("Enter program ID: ");
		programID = scanner.nextInt();
		
		Student student = new Student();
		
		student.setStudentID	(studentID);
		student.setFirstName	(firstname);
		student.setLastName	    (lastname);
		student.setProgramID	(programID);
		
		
		ssiObject.addStudent(student);
		}
		
		List<Student> studentList = ssiObject.getAllStudents();
		
		
		for (Student studentfromList : studentList) {
			System.out.println("Student ID: " + studentfromList.getStudentID());
			System.out.println("Last name: " + studentfromList.getLastName());
			System.out.println("First name: " + studentfromList.getFirstName());
			System.out.println("Program ID: " + studentfromList.getProgramID());
			
			
		}
		
		
		
		
		
	}
}
