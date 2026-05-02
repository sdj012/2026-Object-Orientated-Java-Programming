package inputexception;
import java.util.Scanner;

public class InputException{
	
	public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 int integerOne;
	 int integerTwo;
  	
     System.out.print("Please enter two integers: ");
     
     // Collects input from the user, check for invalid input and re-prompt until correct formats provided
     
     while (true) {
         
         if (input.hasNextInt()) {
             integerOne = input.nextInt();
             if (input.hasNextInt()) {
                 integerTwo = input.nextInt();
                 break;
             } else {
                 System.out.println("You must enter integer numbers.");
                 System.out.println("Please re-enter two numbers:");
                 input.nextLine(); // Tries again
             }
         } else {
             System.out.println("You must enter integer numbers.");
             System.out.println("Please re-enter two numbers:");
             input.nextLine(); // Tries again
         }

     }
     
     int sum=integerOne+integerTwo;
     System.out.print(integerOne + " + " + integerTwo + " = " + sum );
      
	}
}


