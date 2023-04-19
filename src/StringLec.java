import java.util.Scanner;

public class StringLec {
    public static void main(String[] args) {
//        String message = "Hello";
//        System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"

//        String name = "John";
//        name = "Larry";
//        System.out.println(name);
//
//
//
////
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

// Don't do this!
//        boolean confirmation = userInput == "y";
// DO THIS
//        boolean confirmation = userInput.equalsIgnoreCase("y");

//.equals
// determine, case-sensitively, if two strings have the same value.

//.equalsIgnoreCase
// determine if two strings have the same value, disregarding their casing.

//.startsWith
// determine, case-sensitively, if one string starts with another.

//.endsWith
// determine, case-sensitively, if one string ends with another.
//
//
//
//        String sentance = "Today is Tuesday";
//
//        System.out.println(sentance.equals("today is tuesday"));

    String manipulation = "String to manipulate";
// .charAt Returns the character at the specified index of the string.
        System.out.println(manipulation.charAt(4));
// .indexOf Returns the index of the first occurrence of a certain substring Returns -1 if the substring is not found.
        System.out.println(manipulation.indexOf("g"));
// .lastIndexOf  Like indexOf, but starts the search from the end of the string.
        System.out.println(manipulation.lastIndexOf("t"));
// .length Returns the length of a string.
        System.out.println(manipulation.length());
// .replace Returns a copy of the string that has pattern replaced with replacement.
        System.out.println(manipulation.replace("t", "o"));
// .substring Returns a new substring that starts at a specified index and (optionally) ends at the specified index
        System.out.println(manipulation.substring(3,9));
// .toLowerCase Returns a string that has all lower case letters.
        System.out.println(manipulation.toLowerCase());
// .toUpperCase Returns a copy of the string without leading and trailing whitespaces.
        System.out.println(manipulation.toUpperCase());
// .trim Returns a copy of the string without leading and trailing whitespaces.
        System.out.println(manipulation.trim());
    }
}
