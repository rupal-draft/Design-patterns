package solid_principles.liskov_substitution;

// If class B is a subclass of class A,
// then we should be able to use objects of class B in place of objects of class A without breaking the behavior of class A

public class ProblematicClass {

    public static void main(String[] args) {
        // Creating a rectangle and setting dimensions
        RectangleClass rectangle = new RectangleClass();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: 50

        // Using a square in place of a rectangle (a problem starts here)
        RectangleClass square = new SquareClass();
        square.setWidth(5);
        square.setHeight(10); // This breaks the square's invariant
        System.out.println("Square Area: " + square.calculateArea()); // Output is incorrect: 100
    }
}

// Rectangle class
class RectangleClass {

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height; // Area = width × height
    }
}

// Square class extends Rectangle (but violates LSP)
class SquareClass extends RectangleClass {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Ensuring width equals height
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height); // Ensuring height equals width
    }
}