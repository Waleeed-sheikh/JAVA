
// Abstract class representing a Shape
abstract class Shape {
    // Abstract method for calculating area
    public abstract double calculateArea();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate abstraction
class abstraction {
    public static void main(String[] args) {
        // Using abstraction with Shape, Circle, and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling abstract and concrete methods
        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

 


