
class Circle {
    // Private field for encapsulation
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius         : " + radius);
        System.out.println("Area           : " + calculateArea());
        System.out.println("Circumference  : " + calculateCircumference());
    }
}

// Main class to test the Circle class
public class CircleTest {
    public static void main(String[] args) {
        // Create a Circle object with radius 7.5
        Circle circle = new Circle(7.5);

        // Display circle details
        circle.displayDetails();
    }
}
