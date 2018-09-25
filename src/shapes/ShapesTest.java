package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(5,4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//          Because it's an abstract method in the Measurable interface, therefore it must be implemented.
//        What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//          They aren't implemented in Measurable, which is what we are making an instance of.
    }
}
