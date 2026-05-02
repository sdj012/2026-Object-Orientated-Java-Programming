package myarray;
import java.util.Scanner;


public class myArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Array created at default size 1001, as the index number and input will need to sync. 
        // We'll need all numbers from 1 to 1000, so we'll need index space up to 1001.
        
        int[] counts = new int[1001]; 
        
        // Collects input from the user.
        
        System.out.print("Enter the integers between 1 and 1000: ");
        int number = input.nextInt();

        // Reads numbers until the last input, 0 is entered.
        
        while (number != 0) {
        	
            if (number >= 1 && number <= 1000) {
                counts[number]++;   // Increase the number of occurences of a number by storing frequency in an index.
            }
            
            number = input.nextInt();
        }

        // Loops through the array, and displays results in increasing order.
        
        for (int i = 1; i <= 1000; i++) {
        	
            if (counts[i] > 0) {

                if (counts[i] == 1) {
                    System.out.println(i + " occurs 1 time"); // If occurence is once, use singular form.
                } else {
                    System.out.println(i + " occurs " + counts[i] + " times"); // If occurence is more than once, use plural form.
                }
            }
            
        }

        input.close();
    }
}