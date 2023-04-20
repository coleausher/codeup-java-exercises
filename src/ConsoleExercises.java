import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int userInput = sc.nextInt();
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please enter three words: ");
//        String word1 = scan.next();
//        String word2 = scan.next();
//        String word3 = scan.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println("You entered: " + sentence);
//

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter the length of the classroom: ");
        String lengthInput = scanner1.nextLine();
        double length = Double.parseDouble(lengthInput);

        System.out.print("Enter the width of the classroom: ");
        String widthInput = scanner1.nextLine();
        double width = Double.parseDouble(widthInput);

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);


    }
}
