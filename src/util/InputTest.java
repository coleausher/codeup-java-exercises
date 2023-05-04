package util;


public class InputTest {

    public static void main(String[] args) {

        // create an instance of the Input class
        Input input = new Input();

        // test the getString() method
        String stringInput = input.getString("Please enter a String: ");
        System.out.println("You entered: " + stringInput);

        // test the yesNo() method
        boolean yesNoInput = input.yesNo();
        System.out.println("You entered: " + yesNoInput);

        // test the getInt() method
        int intInput = input.getInt( 1, 10);
        System.out.println("You entered: " + intInput);

        // test the getDouble() method
        double doubleInput = input.getDouble( 1.0, 10.0);
        System.out.println("You entered: " + doubleInput);

    }
}
