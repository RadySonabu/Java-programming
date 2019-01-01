package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Janna {
	//storage
	public static Queue<String> line = new LinkedList<String>();
	public static void main(String[] args) {
		//the names to be stored
		String[] customers = {"Naqi", "monty", "Mohin", "paal", "Yasmin", "Maighjoo", "Ashish", "Kevin", "Ruhail", "Tony",};
		//gets the length of the array to be stored
		int customer = customers.length;
		//loop that randomly adds the otem of the array
		for (int i = 0; i < customers.length; i++) {
			int cust = (int) (Math.random()*customer);
			line.add(customers[cust]);
		}
		//checks whether the storage is empty
		boolean empty = line.isEmpty();
		
		//loop that checks that will continue until the storage is empty
		while(!empty  == true){
			System.out.println(line + "\n");
			
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" );
			System.out.println("the size of the line is "+ line.size()  + "\n");
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size()+ "\n" );
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size() + "\n");
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size()+ "\n" );
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size() + "\n");
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size() + "\n");
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size() + "\n");
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size() + "\n");
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size() + "\n");
			System.err.println("The queue has " +  line.size() + " customer left");
			System.out.println(line.remove() + " <=== SERVED" + "\n");
			System.out.println("the size of the line is "+ line.size() + "\n");
			
			break;
		}
	}
}
