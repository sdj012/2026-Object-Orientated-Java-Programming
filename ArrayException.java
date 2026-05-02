package arrayexception;

import java.util.Scanner;
import java.util.Random;

public class ArrayException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int indexInput;
        
        // Array created at default size 100
        
        int[] randomnArray = new Random().ints(100).toArray(); 
        
        System.out.print("Please enter the index: ");
        
        // Collects input from the user, check for invalid input and re-prompt until correct formats provided
        
        while (true) {
        	
	        if (!input.hasNextInt()) {
	            System.out.println("Not-a-Number (Nan) ");
	            System.out.println("Please re-enter the index:");
	            input.next(); // Tries again
	        } else {
	        	indexInput=input.nextInt();
	            if (indexInput >= 100) {
	                System.out.println("Out of Bounds");
	                System.out.println("Please re-enter the index:");
		            input.next(); // Tries again
	            } else if (indexInput <= 0) {
	                System.out.println("Out of Bounds");
	                System.out.println("Please re-enter the index:");
	            } else {
	                break; // Valid input, exit loop
	            }
	        }
        }

        // Reads out value at randomnArray[indexInput]
        
        System.out.print("array[" + indexInput + "] = " + randomnArray[indexInput]);
        
        input.close();
    }
}