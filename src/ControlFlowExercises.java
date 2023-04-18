import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

// 1. Loop Basics
    // A. While
//                int i = 5;
//                 while (i <= 15) {
//                    System.out.println("i is " + i);
//                    i++;
//                }

    // B. Do While
//                int i = 0;
//                do {
//                    System.out.println(i);
//                    i += 2;
//
//                } while (i <= 100);


//                int i = 100;
//                    do {
//                        System.out.println(i);
//                        i -= 5;
//                    }while (i >= -10);


//                int i = 2;
//                do {
//                    System.out.println(i * i);
//                     i++;
//                }while (i * i < 1000000);


    // C. For
//                for(int i = 0; i <= 100; i += 2) {
//                    System.out.println("i is " + i);
//                }

//                for (int i = 100; i <= -10; i -= 5) {
//                    System.out.println("i is " + i);
//
//                }

//                for (int i = 2; i <= 1000000; i++){
//                    System.out.println("i is " + i * i );
//                }

// 2. FIZZ BUZZ
//                for (int i = 1; i <= 100; i++){
//                    System.out.println(i);
//                    if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                    }
//                    if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                    }
//                    if (i % 3 == 0 && i % 5 == 0){
//                        System.out.println("FIzzBuzz");
//                    }
//                }

// 3. DISPLAY A TABLE OF POWERS
//                    Scanner scanner = new Scanner(System.in);
//                    String answer = "y";
//
//                    while (answer.equals("y")) {
//                        System.out.print("Enter an integer: ");
//                        int number = scanner.nextInt();
//
//                        System.out.println("Number\tSquare\tCube");
//
//                        for (int i = 1; i <= number; i++) {
//                            int square = i * i;
//                            int cube = i * i * i;
//                            System.out.println(i + "\t" + square + "\t" + cube);
//                        }
//
//                        System.out.print("Do you want to continue? (y/n): ");
//                        answer = scanner.next();
//                    }

// 4. CONVERT GIVEN NUMBER GRADES INTO LETTER GRADES.
        Scanner scanner = new Scanner(System.in);
        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter numerical grade (0-100): ");
            int numGrade = scanner.nextInt();
            String letterGrade;
            if (numGrade >= 97 && numGrade <= 100){
                letterGrade = "A+";
            } else if (numGrade >= 93 && numGrade <= 96) {
                letterGrade = "A";
            } else if (numGrade >= 90 && numGrade <= 92) {
                letterGrade = "A-";
            } else if (numGrade >= 87 && numGrade <= 89) {
                letterGrade = "B+";
            } else if (numGrade >= 83 && numGrade <= 86) {
                letterGrade = "B";
            } else if (numGrade >= 80 && numGrade <= 82){
                letterGrade = "B-";
            } else if (numGrade >= 77 && numGrade <= 79) {
                letterGrade = "C+";
            } else if (numGrade >= 73 && numGrade <= 76) {
                letterGrade = "C";
            } else if (numGrade >= 70 && numGrade <= 72) {
                letterGrade = "C-";
            } else if (numGrade >= 0 && numGrade <= 69){
                letterGrade = "F";
            }else{
                letterGrade = "F";
            }
            System.out.println("Letter grade: " + letterGrade);
            System.out.print("Continue? (y/n): ");
            answer = scanner.next();
        }

    }
}
