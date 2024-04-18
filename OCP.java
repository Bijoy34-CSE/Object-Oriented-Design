import java.util.ArrayList;
import java.util.List;

/**
* Title : A java programme to demonstrate Open Closed Principle.
*Author: Bijoy Kumar Paul, Student ID: 220234 , Discipline: CSE , Khulna University
 * Represents a shape with a specific area calculation method.
 */
interface Shape {
    /**
     * Calculates the area of the shape.
     *
     * @return The area of the shape.
     */
    double calculateArea();
}

/**
 * Represents a rectangle shape.
 */
class Rectangle implements Shape {
    private double length;
    private double width;

    /**
     * Constructs a new rectangle with the given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle (length * width).
     *
     * @return The area of the rectangle.
     */
    @Override
    public double calculateArea() {
        return length * width;
    }
}

/**
 * Represents a circle shape.
 */
class Circle implements Shape {
    private double radius;

    /**
     * Constructs a new circle with the given radius.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle (π * radius^2).
     *
     * @return The area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Represents a collection of shapes.
 */
class AreaCalculator {
    private List<Shape> shapes;

    /**
     * Constructs a new AreaCalculator with an empty list of shapes.
     */
    public AreaCalculator() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Adds a shape to the collection.
     *
     * @param shape The shape to add.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Calculates the total area of all shapes in the collection.
     *
     * @return The total area of all shapes.
     */
    public double calculateTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

/**
 * Demonstrates the usage of shapes and the area calculator.
 */
class ShapeDemo {
    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create shapes
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        // Add shapes to the area calculator
        AreaCalculator calculator = new AreaCalculator();
        calculator.addShape(rectangle);
        calculator.addShape(circle);

        // Calculate total area
        double totalArea = calculator.calculateTotalArea();
        System.out.println("Total area of all shapes: " + totalArea);
    }
}
 /**
 *In this program:

The Shape interface defines a contract for shapes with a method calculateArea() to calculate their area. 
*This allows for different shapes to implement their area calculation method.
*The Rectangle and Circle classes implement the Shape interface and provide their specific implementations of the calculateArea() method.
*The AreaCalculator class is responsible for calculating the total area of all shapes. It doesn't need to be modified when new shapes are added, adhering to the Open/Closed Principle.
*Proper documentation using JavaDoc format is provided for classes, methods, and parameters to enhance code readability and understanding.
*/
