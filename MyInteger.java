package myinteger;

import java.util.Scanner;

public class MyInteger {

    private int value;

    public MyInteger() {
        value = 5;
    }

    // Constructor with int parameter
    public MyInteger(int newValue) {
        value = newValue;
    }

    // Getter Method
    public int getValue() {
        return value;
    }

    // Even or Odd Test 
    public boolean isEven() {
        return value % 2 == 0;
    }
    
    // Even or Odd Test 
    public boolean isOdd() {
        return value % 2 != 0;
    }

    // Even or Odd Test - Parameter: Integer
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // Even or Odd Check - Parameter: Object
    public static boolean isEven(MyInteger numberObject) {
        return numberObject.value % 2 == 0;
    }
    
    public static boolean isOdd(MyInteger numberObject) {
        return numberObject.value % 2 != 0;
    }

    // Equals Check - Parameter: Integer
    public boolean equals(int num) {
        if (num==value) return true;
        else return false;
    }
    
    // Equals Check - Parameter: Object
    public boolean equals(MyInteger numberObject) {
        if (numberObject.getValue()==value) return true;
        else return false;
        
    }

    // Main testing program
    public static void main(String[] args) {
    	
    	int testingInteger= 0;
    	
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter value for the First Object: ");
    	MyInteger firstObject = new MyInteger(input.nextInt());

    	System.out.print("Enter value for the Second Number: ");
    	MyInteger  secondObject = new MyInteger(input.nextInt());

    	System.out.print("Enter value for the Third Number: ");
    	MyInteger thirdObject = new MyInteger(input.nextInt());
    	
    	System.out.print("Please enter a testing integer value: ");
    	
    	testingInteger=input.nextInt();

        MyInteger defaultClassState = new MyInteger();
        
        System.out.println("The First Number is : " + firstObject.getValue());
        System.out.println("The Second Number is : " + secondObject.getValue());
        System.out.println("The Third Number is : " + thirdObject.getValue());

        System.out.println("\n");
        System.out.println("The Getter Method:");
        System.out.println("\n");
        System.out.println("The First Number is : " + firstObject.getValue());
        System.out.println("The Class by Default Contains : " + defaultClassState.getValue());

        System.out.println("\n");
        System.out.println("Even or Odd Method with an object parameter:");
        System.out.println("\n");
        System.out.println("Is the First Number even?: " + isEven(firstObject));
        System.out.println("Is the Second Number odd?: " + isOdd(secondObject));

        System.out.println("\n");
        System.out.println("Testing Even or Odd Method with an integer parameter:");
        System.out.println("\n");
        

        System.out.println("Is the testing integer even?: " + isEven(testingInteger));
        System.out.println("Is the testing integer odd?: " + isOdd(testingInteger));

        System.out.println("\n");
        System.out.println("Testing Even or Odd Method with an object parameter: ");
        System.out.println("\n");
        System.out.println("Is the value in the default class even? " + isEven(defaultClassState));
        System.out.println("Is the value in the default class odd? " + isOdd(defaultClassState));

        System.out.println("\n");
        System.out.println("Testing method Equals with parameter integer:");
        System.out.println("\n");
        System.out.println("Does the First Number equal to the testing integer?  " + firstObject.equals(testingInteger));
        System.out.println("Does the Second Number equal to the testing integer? " + secondObject.equals(testingInteger));

        System.out.println("\n");
        System.out.println("Testing method Equals with an object parameter:");
        System.out.println("\n");

        System.out.println("Does the Second Number equal the value in the default class value?? " + secondObject.equals(defaultClassState));
        System.out.println("Does the Third Number equal the value in of the default class value? " + thirdObject.equals(defaultClassState));
        
    }
}