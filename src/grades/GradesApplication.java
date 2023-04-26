package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // create students
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);

        Student student2 = new Student("Mary");
        student2.addGrade(65);
        student2.addGrade(70);
        student2.addGrade(70);

        Student student3 = new Student("Mike");
        student3.addGrade(100);
        student3.addGrade(65);
        student3.addGrade(86);

        Student student4 = new Student("Jane");
        student4.addGrade(88);
        student4.addGrade(77);
        student4.addGrade(33);

        // add students to hashmap
        students.put("johndoe123", student1);
        students.put("marykay456", student2);
        students.put("mikejohnson789", student3);
        students.put("janedoe012", student4);

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Welcome! \n" +
                    "Here are the GitHub usernames of our students: \n");
            for (String username : students.keySet()) {
                System.out.println("|" + username + "| ");
            }


            System.out.print(" Enter a GitHub username to see more information: ");
            String usernameInput = input.nextLine();

            if (students.containsKey(usernameInput)) {
                Student student = students.get(usernameInput);
                System.out.println("\n Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average grade: " + student.getAverageGrade());
            } else {
                System.out.println(" Sorry, no users with that username were found.");
            }

            System.out.print(" Would you like to see another student's information? (y/n) ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
    }
}