package tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import model.Student;
import serviceimpl.StudentServiceImpl;

public class StudentTester {
	 static StudentServiceImpl studentserviceimpl =  new StudentServiceImpl();
	 static List<Student> studentList = studentserviceimpl.getAllStudents();
	public static void main(String[] args) {
		 //can use int studentID = scanner.nextInt();
		 
		 Scanner scanner =  new Scanner(System.in);
		 int x;
		 System.out.println("How many student you want to input? ");
		 x = scanner.nextInt();
		 
		 
		 
		 for(int y= 0; y<x ;y++){
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
		 
		 //
		 
		 
		 studentserviceimpl.addStudent(student);
		
		 //initally wala tong laman and yung kabila ay meron ->> na ipinapasa niya sa studentList
		
		 //
		
		 } 
		 //to display all of it same as the above studentList
		 for (Student student1 : studentList) {
			
			 
			 System.out.println(student1.getProgramID());	
			 System.out.println(student1.getFirstName());
			 System.out.println(student1.getLastName());	
			 System.out.println(student1.getProgramID());
			 System.out.println(student1.getAge());
			 System.out.println("\n");
		}
	
		
		 
		 
		 /*
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
		 */
		 
	}
}
