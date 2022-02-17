package ex2;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        // set the Shape name as Square
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4.0;
    }

    public void getInfo() {
        String info = getName() + " with side " + getSide() + " have Perimeter " + getPerimeter() + " and Area " + getArea();
        System.out.println(info);
    }
}
