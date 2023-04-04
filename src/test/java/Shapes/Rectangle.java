package Shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (super.length + super.width);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
}
