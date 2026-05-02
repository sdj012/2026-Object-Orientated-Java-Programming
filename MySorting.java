package mysorting;
import java.util.Scanner;

public class MySorting {
	
	public static void main(String[] args) {
		
		double firstNumberDouble = 0;
		String firstNumberStr ="";
		
		double secondNumberDouble = 0;
		String secondNumberStr ="";
			
		double thirdNumberDouble = 0;
		String thirdNumberStr ="";
		
		Scanner userEntry = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		firstNumberStr = userEntry.nextLine();  // Read user input
		firstNumberDouble = Double.parseDouble(firstNumberStr);
 
		System.out.println("Please enter the second number: ");
		secondNumberStr = userEntry.nextLine();  // Read user input
		secondNumberDouble = Double.parseDouble(secondNumberStr);
		
		System.out.println("Please enter the second number: ");
		thirdNumberStr = userEntry.nextLine();  // Read user input
		thirdNumberDouble = Double.parseDouble(thirdNumberStr);
 
		displaySortedNumbers(firstNumberDouble,secondNumberDouble,thirdNumberDouble);
		
	}
		
		
	public static void displaySortedNumbers(double num0, double num1, double num2) {
		
		double[] numbersArray =new double[3];
		
		numbersArray[0]=num0;
		numbersArray[1]=num1;
		numbersArray[2]=num2;
		
		double largestNum=0.0;
		double smallestNum=0.0;
		double middleNum=0.0;
		
		int i=0;
		
		/*Find the largest number*/
		
		while(i<3) {
			
			if(numbersArray[i]>=num0 && numbersArray[i]>=num1 && numbersArray[i]>=num2) { largestNum=numbersArray[i];}
			if(numbersArray[i]<=num0 && numbersArray[i]<= num1 && numbersArray[i]<=num2) { smallestNum=numbersArray[i];}
			if(numbersArray[i]!=largestNum && numbersArray[i]!=smallestNum) { middleNum=numbersArray[i];}
			
			i++;
		}
		
		System.out.println("ordered numbers " + smallestNum + " " + middleNum + " " + largestNum);
				
	}
	
}
