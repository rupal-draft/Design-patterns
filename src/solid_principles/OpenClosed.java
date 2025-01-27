package solid_principles;

// Open for extension, closed for modification
// This principle ensures that classes are open to adding new functionality but closed to modifying existing functionality.
public class OpenClosed {

    public static void main(String[] args) {
        // Creating shape objects
        Shape circle = new Circle(5);   // Circle with radius 5
        Shape rectangle = new Rectangle(4, 6); // Rectangle with width 4 and height 6

        // Creating an AreaCalculator to calculate areas of different shapes
        AreaCalculator calculator = new AreaCalculator();

        // Calculating and printing areas
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
    }
}

// Step 1: Abstract base class
// Shape is an abstract class (or could be an interface) that allows different shapes to provide their specific implementations.
abstract class Shape {
    public abstract double getArea();  // Each shape must implement this method to calculate its area
}

// Step 2: Concrete class for Circle
class Circle extends Shape {

    private double radius;  // Radius of the circle

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;  // Area = πr²
    }
}

// Step 3: Concrete class for Rectangle
class Rectangle extends Shape {

    private double width;   // Width of the rectangle
    private double height;  // Height of the rectangle

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return width * height;  // Area = width × height
    }
}

// Step 4: AreaCalculator class
// This class adheres to the Open-Closed Principle because we don't need to modify it to add new shapes.
class AreaCalculator {

    // This method calculates the area of any shape by using polymorphism
    public double calculateArea(Shape shape) {
        return shape.getArea();
    }
}
