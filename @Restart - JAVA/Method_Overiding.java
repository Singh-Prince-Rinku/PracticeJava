// Abstract class Shape - serves as a template for all specific shape classes.
abstract class Shape {
    // Abstract method to calculate the area of a shape. 
    // Must be overridden by subclasses.
    abstract double calculateArea();
}

// Circle class - extends Shape and provides implementation for calculateArea().
class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method to calculate the area of the circle.
    @Override
    double calculateArea() {
        return Math.PI * radius * radius; // Area calculation for a circle
    }
}

// Rectangle class - extends Shape and provides implementation for calculateArea().
class Rectangle extends Shape {
    private double length; // Length of the rectangle
    private double width; // Width of the rectangle

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden method to calculate the area of the rectangle.
    @Override
    double calculateArea() {
        return length * width; // Area calculation for a rectangle
    }
}

// Final class ShapeUtils - cannot be subclassed.
final class ShapeUtils {
    // Static method to display the area of a shape.
    // Accepts a Shape object as a parameter.
    public static void displayArea(Shape shape) {
        System.out.println("The area of the shape is: " + shape.calculateArea());
    }
}

// ShapeDemo class to demonstrate the use of Shape, Circle, Rectangle, and ShapeUtils classes.
public class Method_Overiding {
    public static void main(String[] args) {
        // Creating a Circle object with radius 5
        Circle circle = new Circle(5);
        // Creating a Rectangle object with length 4 and width 5
        Rectangle rectangle = new Rectangle(4, 5);

        // Displaying the area of the circle
        ShapeUtils.displayArea(circle);
        // Displaying the area of the rectangle
        ShapeUtils.displayArea(rectangle);
    }
}
