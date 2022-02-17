package ex2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        // Set the shape name as "Rectangle"
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2.0;
    }

    public void getInfo() {
        String info = getName() + " with width " + getWidth() + ", height " + getHeight() + " have Perimeter " + getPerimeter() + " and Area " + getArea();
        System.out.println(info);
    }
}
