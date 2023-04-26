package shapes;

public class Square extends Quadrilateral {
    public int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
}
