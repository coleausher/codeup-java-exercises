package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = null;
        Input input = new Input(null);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.getDouble();

        Circle circle = new Circle(radius);

        System.out.printf("The circumference of the circle is: %.2f%n", circle.getCircumference());
        System.out.printf("The area of the circle is: %.2f%n", circle.getArea());
    }
}
