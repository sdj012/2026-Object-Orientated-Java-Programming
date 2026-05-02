package palindrome;
import java.util.Scanner;
import java.lang.Boolean;
import java.lang.Integer;

public class Palindrome {
		

	public static void main(String[] args) {
		
		int number = 0;
		Boolean outcome = null;
		String numberEntry ="";
		
		Scanner userEntry = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
			
		numberEntry = userEntry.nextLine(); 

		number = Integer.parseInt(numberEntry); 
 
		outcome=isPalindrome(number); 
				
		if(outcome)System.out.println(number + " is a palindrome");
		if(!outcome)System.out.println(number + " is not a palindrome");
		
	}

	
	public static boolean isPalindrome (int Number) {
		
		int numberCopy=Number;
		int numberMirror=0;
		int lastDigit=0;
		Boolean isPalindrome=null;
		
		
		do { 
				
			lastDigit = numberCopy % 10; // Digit Extraction
			
			numberMirror = numberMirror*10 + lastDigit; // Mirror Built 
		
			numberCopy=(int) Math.floor(numberCopy/10); // Number Truncation
			
			
				if(numberMirror == Number) {
				
					isPalindrome=true;
					
				} else isPalindrome=false;
	
		} while (numberCopy!=0); 
			
		return isPalindrome;
	
	}
	
}
	


