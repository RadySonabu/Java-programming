package conversion;

import java.util.Scanner;

public class Conversion {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter a decimal number! or enter 0 to stop");
		int n = (scanner.nextInt());
		
		if(n != 0){
			
			while(n != 0){
				
				System.out.print("Binary representation of " + n + " is: ");
		    	System.out.println(Integer.toBinaryString(n));
		    	System.out.print("Octal representation of " + n+ " is: ");
		    	System.out.println(Integer.toOctalString(n));
		    	System.out.print("Hexadecimal representation of " + n+ " is: ");
		    	System.out.println(Integer.toHexString(n));
		    	System.out.println("\nEnter a decimal number! or enter 0 to stop");
				n = scanner.nextInt();
			}
			
		}else{
			
			System.out.println("Ends");
			System.exit(0);
			
		}
		
	}	
}
