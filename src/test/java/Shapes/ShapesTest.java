package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Square theSquare = new Square(5, 4);
        Rectangle theRectangle = new Rectangle(9, 5);

        System.out.println(theSquare.getArea());
        System.out.println(theSquare.getPerimeter());

        System.out.println(theRectangle.getArea());
        System.out.println(theRectangle.getPerimeter());


    }

}
