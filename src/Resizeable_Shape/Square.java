package Resizeable_Shape;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * (percent / 100));
        System.out.println(getSide());
    }
}
