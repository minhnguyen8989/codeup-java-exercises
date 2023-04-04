package Shapes;

public class Square extends Quadrilateral {

    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
