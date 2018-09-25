package shapes;

public class Square extends Quadrilateral {
    private  static double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    protected void setLength(double length) {
        this.length = side;
    }

    @Override
    protected void setWidth(double width) {
        this.width = side;

    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
