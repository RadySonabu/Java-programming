package tester;

import java.util.Scanner;

import model.Student;

public class StudentTester {
	public static void main(String[] args) {
		 //can use int studentID = scanner.nextInt();
		 
		 Scanner scanner =  new Scanner(System.in);
		 
		 System.out.println("Input student ID: ");
		 int studentID = scanner.nextInt();
		 
		 System.out.println("Input last name: ");
		 String lastName = scanner.next();
		 
		 System.out.println("Input first name");
		 String firstName = scanner.next();
		 
		 System.out.println("Input program ID: ");
		 int programID = scanner.nextInt();
		 
		 System.out.println("Enter age: ");
		 int age = scanner.nextInt();
		 
		 Student student = new Student();
		 
		 student.setStudentID(studentID);
		 student.setFirstName(firstName);
		 student.setLastName(lastName);
		 student.setProgramID(programID);
		 student.setAge(age);
		 
		 studentID = student.getStudentID();
		 age = student.getAge();
		 firstName =student.getFirstName();
		 lastName = student.getLastName();
		 programID = student.getProgramID();
		 
		 System.out.println("The student ID is " + studentID);
		 System.out.println("The first name of the student: " + firstName);
		 System.out.println("The last name of the student: " + lastName);
		 System.out.println("The program ID of the student: " + programID);
		 System.out.println("The age of the student: " + age);
	}
}