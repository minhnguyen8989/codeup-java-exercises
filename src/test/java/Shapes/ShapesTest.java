package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle();

        System.out.println("Area of the Rectangle is: " + box1.getArea(4,5));
        System.out.println("Perimeter of the Rectangle is: " + box1.getPerimeter(4,5));
    }
}
