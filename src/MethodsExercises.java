import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        int num1 = 2;
//        int num2 = 3;

//        Addition Method call
//          System.out.println("Added number is: " + addition(num1,num2));

////          Subtraction Method call
//        System.out.println("Subtracted number is: " + subtraction(num1,num2));

////        Multiplication Method call
//        System.out.println("Multiplied number is: " + multiplication(num1,num2));

////        Division Method call
//        System.out.println("Divided number is: " + division(num1,num2));

////        Modulus Method call
//        System.out.println("Modulus number is: " + modulus(num1,num2));

////        Multiplication Loop Method call
//        System.out.println("Multiplied number is: " + multi(num1,num2));

////        Multiplication Recursion Method call
//        System.out.println("Multiplied number is: " + multip(num1,num2));


////        getInteger Method call
//        int userInput = getInteger(1, 10);
//        System.out.println("Your number is: " + userInput);

//        System.out.println(dice());

    }
////   ------------------- Addition Method ----------------
//    public static int addition(int num1, int num2){
//        return num1 + num2;
//    }

////   ------------------ Subtraction Method --------------------
//    public static int subtraction(int num1, int num2){
//        return num1 - num2;
//    }

////   ------------------ Multiplication Method ------------------
//    public static int multiplication(int num1, int num2){
//        return num1 * num2;
//    }

////   ------------------- Division Method ---------------------
//    public static int division(int num1, int num2){
//        return num1 / num2;
//    }

////   --------------------- Modulus Method -----------------------
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }

////  ------------- Multiplication Method using a loop -------------
//    public static int multi(int num1, int num2) {
//        int result = 0;
//        for (int i = 0; i < num2; i++) {
//            result += num1;
//        }
//        return result;
//    }

////   --------------- Multiplication Method using recursion ------------------
//    public static int multip(int num1, int num2) {
//        if (num2 == 0) {
//            return 0;
//        } else if (num2 > 0) {
//            return num1 + multip(num1, num2 - 1);
//        } else {
//            return -multip(num1, -num2);
//        }
//    }

    ////   ------------------ getInteger Method --------------------
//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        }
//        return getInteger(min, max);


//    ------------------ Factorial -------------------
//    public class Factorial {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            boolean Continue = true;
//
//            while (Continue) {
//                System.out.print("Enter an integer between 1 and 10: ");
//                int num = scanner.nextInt();
//
//                if(num < 1 || num > 10) {
//                    System.out.println("ERROR: Please enter an integer between 1 and 10");
//                    continue;
//                }
//
//                long fact = 1;
//                for (int i = 1; i <= num; i++) {
//                    fact *= i;
//                }
//
//                System.out.println("The factorial of " + num + " is " + fact + ".");
//
//                System.out.print("Do you want to continue? (y/n): ");
//                String userInput = scanner.next().toLowerCase();
//
//                if (userInput.equals("n")) {
//                    Continue = false;
//                }
//            }
//            System.out.println("Goodbye!");
//        }
//    }
//    }


// -------------------- DICE ------------------------------
    public static String dice(){
    Scanner scanner = new Scanner (System.in);
        System.out.println("How many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int) ((Math.random() * sides) + 1);


        return "dice #1 = " + dice1 + " dice #2 = " + dice2;
    }

}

// --------------------- GAME DEVELOP ---------------------------

