package array;

import java.util.Scanner;

public class ArrayClass {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		
		System.out.println("Enter the number of arrays you want");
		int x = scanner.nextInt();	
		int numbers[] = new int[x];
		
		for(int a = 0; a < numbers.length; a++){
			System.out.println(numbers[a]);
		}
		
		/*for (int i : numbers) {
			System.out.println("Number: " + i);
		}*/
		
		
	}
}
