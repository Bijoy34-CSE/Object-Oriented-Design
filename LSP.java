/**
*Title : A java programme to demonstrate Liskov Substitution Principle.
*Author: Bijoy Kumar Paul, Student ID: 220234 , Discipline: CSE , Khulna University
 * Represents a shape with a width and height.
 */
abstract class Shape {
    protected double width;
    protected double height;

    /**
     * Constructs a new shape with the given width and height.
     *
     * @param width  The width of the shape.
     * @param height The height of the shape.
     */
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates and returns the area of the shape.
     *
     * @return The area of the shape.
     */
    public abstract double getArea();
}

/**
 * Represents a rectangle, a specific type of shape.
 */
class Rectangle extends Shape {

    /**
     * Constructs a new rectangle with the given width and height.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        super(width, height);
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }
}

/**
 * Represents a square, a specific type of shape.
 */
class Square extends Shape {

    /**
     * Constructs a new square with the given side length.
     *
     * @param sideLength The side length of the square.
     */
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    /**
     * Calculates and returns the area of the square.
     *
     * @return The area of the square.
     */
    @Override
    public double getArea() {
        return width * width; // Since width and height are equal for a square
    }
}

/**
 * Represents a shape calculator.
 */
class ShapeCalculator {

    /**
     * Calculates and returns the total area of an array of shapes.
     *
     * @param shapes The array of shapes.
     * @return The total area of the shapes.
     */
    public double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

/**
 * Demonstrates the usage of shapes and the shape calculator.
 */
public class LSPDemo {
    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create shapes
        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(4);

        // Calculate total area
        ShapeCalculator calculator = new ShapeCalculator();
        double totalArea = calculator.getTotalArea(new Shape[]{rectangle, square});

        // Print total area
        System.out.println("Total area of shapes: " + totalArea);
    }
}
/**
*Shape is an abstract class representing a generic shape with width and height attributes.
*Rectangle and Square are concrete subclasses of Shape, representing specific types of shapes.
*Each shape overrides the getArea() method to calculate its area.
*ShapeCalculator class has a method getTotalArea() which calculates the total area of an array of shapes, adhering to LSP as it can work with any subclass of Shape.
*LSPDemo class demonstrates the usage of shapes and the shape calculator, where both rectangles and squares are treated uniformly as shapes.
*/
