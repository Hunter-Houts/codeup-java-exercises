package shapes;

public class Circle {
    private double radius;
    private static double pi = Math.PI;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return pi * (Math.pow(radius,2));
    }
    public double getCircumference(){
        return 2 * pi * radius;
    }

}
