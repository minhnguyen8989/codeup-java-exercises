package Shapes;

public class Square extends Quadrilateral {


    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return Math.pow(super.length, 2);
    }
}
