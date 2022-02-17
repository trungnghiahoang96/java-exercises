package ex2;

public abstract class Shape {
    private String name;

    public Shape() {
        this.name = "Unknown";
    }

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
