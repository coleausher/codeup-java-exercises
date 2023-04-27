package ExeptionsAndErrors;

import java.util.Scanner;

public class ExeptionsAndErrorsLecture {

    public static void main(String[] args) throws Exception {

        String indentationPreference;

        try {
            indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice.");
        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
        }


       // index          0  1  2
//        int[] numbers = {1, 2, 3};
        //Exception means is an easy fix in program / the code will still run just needs a tweak
//        System.out.println(numbers[999]); // Exception index 999 out of bounds bc there is no such index of 999
//        System.out.println(numbers[1]); // gets the number at index 1 bc there is something at that index

        //ERROR means not an immediate fix for program / code completely stops and won't continue until fixed
//        int[] secondArray = {"cole", 1}; // Error: incompatible types stored in array

        try {
            System.out.println("Let's see...");
            int result = 1 / 0; //1. catch stops exception here
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!"); //2. runs exception here
        }

        // atm daily limit
        int[] numbers = {1, 2, 3};
        int x;

        try {
            x = numbers[100]; // throws exception here / trying to withdraw past atm daily allowance
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an array index exception!"); // withdraw past atm daily allowance runs this
        } catch (Exception e) {
            System.out.println("Caught a generic exception!"); // withdraw past amount in account runs this
        } finally {
            System.out.println("This will always run."); // finally statement will always run like printing a receipt
        }
        getIndentationPreference();
    }


    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();
        Integer.valueOf(indentationPreference);


        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        return indentationPreference;
    }



}
