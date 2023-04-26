package shapes;

public  class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}



//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (length * 2) + (width * 2);
//    }
//
//    public static void main(String[] args) {
//
//
//
//
//
//    }