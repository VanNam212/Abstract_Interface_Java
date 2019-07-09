package Resizeable_Shape;

public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.5);
        ((Circle) shapes[0]).resize(Math.random() * 100);
        shapes[1] = new Rectangle(2, 3);
        ((Rectangle) shapes[1]).resize(Math.random() * 100);
        shapes[2] = new Square(2);
        ((Square) shapes[2]).resize(Math.random() * 100);
    }
}
