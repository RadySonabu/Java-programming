package tester;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import model.Student;

public class QueueTester {
	public static Queue<Student> studenQueue = new LinkedList<Student>();
	public static void main(String[] args) {
		
		 int studID = 0;
		 String lastname = "";
		 String firstname = "";
		 int programID = 0;
		
		 Scanner scanner = new Scanner(System.in);
		 
		 for (int i = 0; i < 2; i++) {
			 System.out.println("Enter student ID: ");
			 studID = scanner.nextInt();
			 System.out.println("Enter lastname: ");
			 lastname = scanner.next();
			 System.out.println("Enter firstname: ");
			 firstname = scanner.next();
			 System.out.println("Enter program ID: ");
			 programID = scanner.nextInt();
			 
			 //instantiate Student Object
			 Student student = new Student();
			 
			//storing the data in the variables
			 student.setStudID(studID);
			 student.setLastname(lastname);
			 student.setFirstname(firstname);
			 student.setProgramID(programID);
			
			 studenQueue.add(student);
		 }
		//checks whether the storage is empty
			boolean empty = studenQueue.isEmpty();
			
			//loop that checks that will continue until the storage is empty
			while(!empty  == true){
				System.out.println(studenQueue + "\n");
				
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove().getFirstname() + " <=== SERVED" );
				System.out.println("the size of the studenQueue is "+ studenQueue.size()  + "\n");
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size()+ "\n" );
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size() + "\n");
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size()+ "\n" );
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size() + "\n");
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size() + "\n");
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size() + "\n");
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size() + "\n");
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size() + "\n");
				System.err.println("The queue has " +  studenQueue.size() + " customer left");
				System.out.println(studenQueue.remove() + " <=== SERVED" + "\n");
				System.out.println("the size of the studenQueue is "+ studenQueue.size() + "\n");
				
				break;
			}
			
				
				
			
		 
		 
		
	}
}
