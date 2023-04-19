import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean confirm;

        System.out.println("What would you like to ask Bob?");
        input = scanner.nextLine();

        do {


        if (input.contains("?")) {
            System.out.println("Sure.");


        } else if (input.endsWith("!")) {
            System.out.println("Whoa, chill out!");

        } else if (input.equals("")) {
            System.out.println("Fine. Be that way!");

        } else {
            System.out.println("Whatever.");
        }
            System.out.println("Do you want to ask another question? [y/n]");
            confirm = scanner.nextLine().equalsIgnoreCase("y");
        }while(confirm);
    }
}
