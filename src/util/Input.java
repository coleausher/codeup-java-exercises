package util;


import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int input = scanner.nextInt();
        while (input < min || input > max) {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            input = scanner.nextInt();
        }
        scanner.nextLine();
        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        while (input < min || input > max) {
            System.out.printf("Please enter a double between %f and %f: ", min, max);
            input = scanner.nextDouble();
        }
        scanner.nextLine();
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public int getInt(int i, int i1, String s) {
    }
}
