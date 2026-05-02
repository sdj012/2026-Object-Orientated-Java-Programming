package smallestFactors;
import java.util.Scanner;


public class SmallestFactors {
	
	public static void main(String[] args) { 
		
		int number=0;
		boolean valid=false;
		
		String numberString="";
		Scanner userEntry = new Scanner(System.in);
		

			while (!valid) {
				
				System.out.println("Please enter a postive integer: ");
				numberString = userEntry.nextLine();
				
			try {
			    
			    number = Integer.parseInt(numberString);
			
			    if (number <= 0) {
			        System.out.println("The number must be positive.");
			        
			    } else { valid=true;}
			
			} catch (NumberFormatException e) {
			    System.out.println("Invalid input! Please enter a valid integer.");
			}
		}

		findFactors(number);
	}
	
	public static void findFactors(int number) {

		StringBuilder primeFactors = new StringBuilder();

		int i = 2;
		while (number > 1) { 
		    if (number % i == 0) {
		        primeFactors.append(i + ",");
		        number = number / i; 
		    } else { 
		    	 i++;
		    }
		}
		
		primeFactors.setLength(primeFactors.length() - 1);
		System.out.println(primeFactors.toString());

	}
	
	

	
}
