package shapes;
import util.Input;


public class CircleApp {
    static Input scan = new Input();
    private static int numOfCircles = 0;
    public static int count(){
        return ++numOfCircles;
    }
    public static void makeCircle(){
        System.out.println("Enter a radius: ");
        double userInput = scan.getDouble();
        Circle myCircle = new Circle(userInput);
        count();
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());
    }
    public static void main(String[] args) {
        System.out.println("Do you want to create a circle?");
        while(Input.yesNo()) {
            makeCircle();
            System.out.println("Do you want to make another circle?");

        }
        System.out.println(numOfCircles);
    }
}
