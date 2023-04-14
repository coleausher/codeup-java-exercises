public class SyntaxLecture {

    public static void main(String[] args) {
        System.out.println("every statement must end with a semicolon");
        // byte, short, int, and long only store (within their range) whole numbers
        byte myByte = 54;
        short myShort = 10000;
        int myInt = 100000;
        long myLong = 6L;

        // float and double can store (within their range) whole or decimal numbers
        float myFloat = 56.78f;
        double myDouble = 6.78;

        // char will store individual A character in a single quote ' '
        char myChar = 'C';

        // boolean stores true and false values
        boolean myBoolean = true;

        // \(backslash) is an escape character for your strings
        String myString = "This is my string, my string must be in \"double quotes\" ";
        // example of invalid string format
        //        String myString = 'my single quote string'

        String myUnitializedString;
        myUnitializedString = "Now my string has a value";

        // the 'final' keyword is the same as 'const' keyword in JS
        final String name = "Joe";

        // binary operators + - * / %
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 % 2);

        // unary operators expect a variable not a hard coded number (++ increment, -- decrement)
        // System.out.println(5++); <-- wont work
        int num = 5; // <--- this works!!!!
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num--);
        System.out.println(--num);

        // Casting
        // I have this 'int' that can also fit in a 'long'
        int myInteger = 900;
        long morePrecise = myInteger;

        // THIS SNIPPET WILL NOT WORK
//           int bigBaby = 1000; // <--- cant fit in a byte
        // we get an error because we cant store something inside a container that is smaller than itself
//            byte smallCrateNotForBigBaby = bigBaby;

        double pi =3.14159;
        // I only put '(int)' in order to ensure that my 'double' mutates into an int
        int almostPi = (int) pi;
        System.out.println(almostPi);
    }
}



/* ------------------ primitive data types -------------------

1. byte (-128 to 127)
2. short (-32,768 to 32,767)
3. int (-2,147,483,648 to 2,147,483,647)
4. long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
5. float (Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits)
6. double (Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits)
7. char (A single Unicode character that’s stored in two bytes)
8. boolean (A true or false value)

 */




/* ------------------- strings ------------------------

Special characters inside of strings must be escaped (i.e. prefixed with a backslash). Here are some of the most common escape sequences:
"\"" // => "
"\\" // => \
"\n" // => the newline character
"\t" // => the tab character

 */
