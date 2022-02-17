package ex2;

public class Circle extends Shape {
    private double radius;
    public static final double PI = Math.PI;

    public Circle(double radius) {
        // set the shape name as Circle
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (double) Math.round(PI * radius * radius * 100) / 100;
    }

    public double getPerimeter() {
        return (double) Math.round(2.0 * PI * radius * 100) / 100;
    }

    public void getInfo() {
        System.out.println(getName() + " with radius " + getRadius() + " have Perimeter " + getPerimeter() + " and Area " + getArea());
    }
}
