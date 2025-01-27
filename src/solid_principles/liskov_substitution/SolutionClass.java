package solid_principles.liskov_substitution;

// This example follows the Liskov Substitution Principle
public class SolutionClass {

    public static void main(String[] args) {
        // Creating a rectangle and setting dimensions
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: 50

        // Creating a square and setting dimensions
        Shape square = new Square(5);
        System.out.println("Square Area: " + square.calculateArea()); // Output: 25
    }
}

// Abstract Shape class (base class for all shapes)
abstract class Shape {
    public abstract int calculateArea(); // Abstract method to calculate area
}

// Rectangle class adheres to the Liskov Substitution Principle
class Rectangle extends Shape {

    private int width;
    private int height;

    // Constructor to initialize width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    @Override
    public int calculateArea() {
        return width * height; // Area = width × height
    }
}

// Square class adheres to the Liskov Substitution Principle
class Square extends Shape {

    private int side;

    // Constructor to initialize the side of the square
    public Square(int side) {
        this.side = side;
    }

    // Method to calculate the area of the square
    @Override
    public int calculateArea() {
        return side * side; // Area = side²
    }
}
