package Resizeable_Shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius();
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * (percent / 100));
        System.out.println(getRadius());
    }
}
