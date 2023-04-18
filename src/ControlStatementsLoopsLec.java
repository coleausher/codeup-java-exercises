import java.util.Scanner;

public class ControlStatementsLoopsLec {
    public static void main(String[] args) {
//       ----------Boolean Expression---------
//        System.out.println(10 > 5);
//        System.out.println(5 == 5);
//        System.out.println(true == false);
//        System.out.println(2 <= 2);

        //----------Logical Operators---------
//        System.out.println((true == true) && (true == false));

        boolean isLoggedIn = true;
        boolean isAdmin = true;
//        if (isLoggedIn && isAdmin) {
//            System.out.println("This is the admin page");
//        }else {
//            System.out.println("login in");
//        }

//        if (isLoggedIn) {
//            System.out.println("Show home page");
//        }else {
//            System.out.println("login in");
//        }


        //----------String Comparison---------
        Scanner sc = new Scanner(System.in);
//        System.out.println("Continue? [y/N]");
//        String userInput = sc.next();
//
//        boolean confirmation = userInput.equals("y");
//
//        System.out.println(confirmation);


//        another example of string comparison
//        String str1 = "y";
//        System.out.println("Type 'y'");
//        String str2 = sc.next();

//        System.out.println("String 1 is: " + str1);
//        System.out.println("String 2 is: " + str2);
//
//        System.out.println("string 1 == string2 ?" + str1 == str2);
//        The above is wrong - we're asking Java "is this Object the same as the other object  ---> false here

//        System.out.println("string 1 == string2 ? \n" + str1.equals(str2));
//        the above is correct - we're asking Java "does this object have the same VALUE as the other object

//        String str1 = "Codeup";
//        String str2 = "codeup";
//
//        System.out.println(str1.equalsIgnoreCase(str2));


// cannot compare two objects or reference types to each other; ONLY PRIMITIVE DATA CAN BE COMPARED


        //----------Control Structures---------

//        if/else if/else
//        int age = 5;
//
//        if((age >= 21) && (age < 65)) {
//            System.out.println("Adult");
//        }else if((age >= 18) && (age < 21)) {
//            System.out.println("teen");
//        }else if((age > 0) && (age < 18)) {
//            System.out.println("baby");
//        }else{
//            System.out.println("Senior");
//        }

//        if
//        boolean lectureTime = false;
//        if(lectureTime) {
//            System.out.println("yay lecture time");
//        }

//        boolean learningJava = false;
//        boolean learningJS = false;
//        boolean learningCss = false;
//
//        if (learningJava) {
//            System.out.println("Java is fun");
//        }else if(learningJS) {
//            System.out.println("Learning JS");
//        }else if(learningCss) {
//            System.out.println("Learning Css");
//        }else {
//            System.out.println("learning something else");
//        }

        //----------Switch Cases---------
//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

        int random = (int)(Math.random() * 3) + 1;
        System.out.println("random num is: " + random);

        switch (random) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default case");
                break;
        }
//------------------------- WHILE Loops --------------------------------- (will run continuously and need to break out)
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        boolean orderFood = true;
//        while (orderFood){
//            System.out.println("Order food, I am hungry");
//            orderFood = false;
//        }
//------------------------- DO WHILE Loops --------------------------------- (no matter condition will run once unless)
//        do {
//            System.out.println("You will see this despite the condition");
//        } while (false);
//
//        do {
//            System.out.println("Order food again");
//            orderFood = false;
//        } while(orderFood);


//------------------------- FOR Loops --------------------------------- ()
//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }

//------------------------- BREAK AND CONTINUE --------------------------------- ()
        // print the numbers 1 through 5
//
//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+
//            } //                        |
//        } //                            |
//// <----------------------------+


        for (int i = 0; i < 20; i++){
            if(i == 7) {
                System.out.println("Lucky number");
                continue;
            }
            if(i == 9){
                System.out.println("Stop loop here");
                break;
            }
            System.out.println("i == " + i);
        }

    }
}










