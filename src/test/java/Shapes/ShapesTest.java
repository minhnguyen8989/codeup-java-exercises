package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Rectangle(9,5);
        myShape = new Square(5);


        System.out.printf("The Area of Square is: %s %n", myShape.getArea());
        System.out.printf("The Perimeter of Square is: %s %n", myShape.getPerimeter());

        System.out.printf("The Perimeter of Rectangle is: %s %n", myShape.getPerimeter());
        System.out.printf("The Perimeter of Area is: %s %n", myShape.getArea());



    }

}
