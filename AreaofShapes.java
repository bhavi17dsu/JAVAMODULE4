import java.util.Scanner;
class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);
        System.out.println("\n--- Circle ---");
        c.displayShape();
        System.out.println("Area: " + c.area());
        System.out.println("\n--- Rectangle ---");
        rect.displayShape();
        System.out.println("Area: " + rect.area());
        sc.close();
    }
}
