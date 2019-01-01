package tester;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class StudentListTester {
	
	public static void main(String[] args) {
		
		 int studID = 0;
		 String lastname = "";
		 String firstname = "";
		 int programID = 0;
	 
		 //instantiate Student Object
		 Student student = new Student();
		 
		 //create a ontainer to store student data
		 ArrayList<Student> studentlist = new ArrayList<Student>();
		 
		 // use scanner to accept from keyboard
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter student ID: ");
		 studID = scanner.nextInt();
		 System.out.println("Enter lastname: ");
		 lastname = scanner.next();
		 System.out.println("Enter firstname: ");
		 firstname = scanner.next();
		 System.out.println("Enter program ID: ");
		 programID = scanner.nextInt();
		 
		 //storing the data in the variables
		 student.setStudID(studID);
		 student.setLastname(lastname);
		 student.setFirstname(firstname);
		 student.setProgramID(programID);
		 
		 //store student object in studentlist 
		 studentlist.add(student);
		 
		 // display data using get method
		 System.out.println(""+ student.getStudID());
		 System.out.println(""+student.getLastname());
		 System.out.println(""+student.getFirstname());
		 System.out.println(""+student.getProgramID());
		 
	}
}
