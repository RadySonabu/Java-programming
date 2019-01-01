package day162618;

import java.util.Scanner;

public class GradingSystem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Grade: ");
		grade = scanner.nextDouble();
		
		
		
		try{
			if(grade==100 || grade >= 96){
				System.out.println("You are Excellent!");
			}else if(grade== 95 || grade >=91){
				System.out.println("You are Outstanding");
			}else if(grade== 90 || grade >=86){
				System.out.println("You are Very Good");
			}else if(grade== 85 || grade>=81){
				System.out.println("You are Good");
			}else if(grade == 80 || grade >=75){
				System.out.println("You are Passed");
			}else if(grade<=74 || grade >=0){
				System.out.println("You are Failed");
			}
		}catch(Exception e){
			System.out.println("Error!");
		}
	}

}
