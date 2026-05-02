package rectangle;
import java.util.Scanner;

public class Rectangle extends GeometricShape {

    // Creates encapsulated data fields. 
	
    private double w = 3.0;
    private double h = 4.0;

    // No-arg constructor
    
    public Rectangle() {
        super();
    }

    // Constructor with width and height
    
    public Rectangle(double w, double h) {
        super();
        this.w = w;
        this.h = h;
    }

    // Getter for width
    
    public double getWidth() {
        return w;
    }

    // Setter for width
    
    public void setWidth(double w) {
        this.w = w;
    }

    // Getter for height
    
    public double getHeight() {
        return h;
    }

    // Setter for height
    
    public void setHeight(double h) {
        this.h = h;
    }

    // Perimeter Calculator
    
    public double getPerimeter() {
        return 2 * (w + h);
    }

    // Area Calculator
    
    public double getArea() {
        return w * h;
    }

    // Override parent class's toString()
    
    @Override
    public String toString() {
        return "Rectangle: width = " + w + " and height = " + h;
    }

    public static void main(String[] args) {

    	// Collects user input, assigns as appropriate variables
    	
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter width: ");
        double width = input.nextDouble(); 
        
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        
        // Buffer clear
        
        input.nextLine(); 
        
        System.out.print("Enter colour: "); 
        String colour = input.nextLine();

        System.out.print("Is the rectangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        // Create rectangle object
        
        Rectangle rectangle = new Rectangle(width, height);

        // Set inherited properties
        
        rectangle.setColour(colour);
        rectangle.setFilled(filled);

        // Output results to the user
        
        System.out.println("\n" + rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Colour: " + rectangle.getColour()); // Inherits method from the parent class
        System.out.println("Filled: " + rectangle.isFilled()); // Inherits method from the parent class

        input.close();
    }
}