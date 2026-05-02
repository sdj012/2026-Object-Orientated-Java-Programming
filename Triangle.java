package triangle;

import java.util.Scanner;

public class Triangle extends GeometricShape {

    private double side1 = 3.0;
    private double side2 = 4.0;
    private double side3 = 5.0;

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessors
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Perimeter Generator
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Area Generator
    public double getArea() {
        double p = getPerimeter() / 2;
        
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        
        double roundedDown=Math.floor(area * 100) / 100;

        return roundedDown;
    }

    // toString method
    @Override // This method overrides the super class's toString method as it returns a different implementation
    public String toString() { 
        return "Triangle: side 1 = " + side1 +
                ", side 2 = " + side2 +
                ", and side 3 = " + side3;
    }

    // Main testing program
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Side 1: ");
        double s1 = input.nextDouble();

        System.out.print("Please Enter Side 2: ");
        double s2 = input.nextDouble();

        System.out.print("Please Enter Side 3: ");
        double s3 = input.nextDouble();

        input.nextLine();

        System.out.print("Colour: ");
        String colour = input.nextLine();

        System.out.print("Is triangle filled? (True or false?): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(s1, s2, s3);
        triangle.setColour(colour);
        triangle.setFilled(filled);

        System.out.println("\n" + triangle);
        System.out.println("Area: " + triangle.getArea()); // Sub class method
        System.out.println("Perimeter: " + triangle.getPerimeter()); // Sub class method 
        System.out.println("Colour: " + triangle.getColour()); // Super class method
        System.out.println("Filled: " + triangle.isFilled()); // Super class method

        input.close();
    }
}
