package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Square theSquare = new Square (5);
        Rectangle theRectangle = new Rectangle(9, 5);

        System.out.printf("The Area of Square is: %s %n", theSquare.getArea());
        System.out.printf("The Perimeter of Square is: %s %n", theSquare.getPerimeter());

        System.out.printf("The Perimeter of Rectangle is: %s %n", theRectangle.getPerimeter());
        System.out.printf("The Perimeter of Area is: %s %n", theRectangle.getArea());



    }

}
