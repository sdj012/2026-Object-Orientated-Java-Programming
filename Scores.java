package scores;
import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		
		String studentsEntry ="";
		int students=0;

		String scoresEntry ="";
		String scores= "";

		Scanner userEntry = new Scanner(System.in);
		System.out.println("Please enter number of students: ");
		
		studentsEntry = userEntry.nextLine();
		students=Integer.parseInt(studentsEntry);
		
		System.out.println("Please enter " + students + " scores separated by a space ");
		scoresEntry = userEntry.nextLine();
		scores=scoresEntry;

		gradeAssigner(students,scores);
	}
	
	public static void gradeAssigner (int students, String scores) {
		
		int bestScore=0;

		int Afloor=0;
		int Bfloor=0;
		int Cfloor=0;
		int Dfloor=0;
		
		String scoresArray[]=scores.split(" ");
		int[] numberArray = new int[students];

		/*Convert the String Array to a Numbers Array*/

		for(int i=0; i<scoresArray.length ; i++ ) {	
			numberArray[i]=Integer.parseInt(scoresArray[i]);
		}
		
		/*Determine the Best Score*/
		
		for(int i=0; i<numberArray.length ; i++ ) {	
			if(numberArray[i]>=bestScore) {
				bestScore=numberArray[i];
			};
		}
		
		Afloor=bestScore-10;
		Bfloor=bestScore-20;
		Cfloor=bestScore-30;
		Dfloor=bestScore-40;
		
		/*Find Grade */
		
		for(int i=0; i<numberArray.length ; i++ ) {	
			
			if(numberArray[i]>=Afloor) { /*grade is A*/ finalGrade(i,numberArray[i],"A");}
			if(numberArray[i]<Afloor && numberArray[i]>=Bfloor) { /*grade is B*/ finalGrade(i,numberArray[i],"B");}
			if(numberArray[i]<Bfloor && numberArray[i]>=Cfloor) { /*grade is C*/ finalGrade(i,numberArray[i],"C"); }
			if(numberArray[i]<Cfloor && numberArray[i]>=Dfloor) { /*grade is D*/ finalGrade(i,numberArray[i],"D");}
			if(numberArray[i]<Dfloor) { /*grade is F*/ finalGrade(i,numberArray[i],"F");}
			
			};
		}
	
		public static void finalGrade(int index, int score, String grade) {
			System.out.println("Student " + (index+1) +  " score is " + score + " and their grade is " + grade);
		}
		

	}
	


