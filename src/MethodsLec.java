public class MethodsLec {
    public static void main(String[] args) {
//        Calling a method
        sayHello("Cole");
//        Calling same sayHello method but without/different parameter to get different output
        sayHello();
//        Calling another method with the same name sayHello but with different parameters to allow to call it
        sayHello("Salutations", "Cole");
//        Calling returnThree method
        returnThree();

        count(5);
    }

//    Defining a method
    public static String sayHello(String name) {
        System.out.printf("Hello, %s!", name);
        return String.format("Hello, %s!", name);
    }
//    Defining another method with the same name sayHello with no parameters
    public static String sayHello(){
        System.out.print("Hello, World!");
        return String.format("Hello, World!");
    }
//    Defining another method with the same name sayHello with 2 parameters
    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }


    //    Defining another method
    public static int returnThree() {
        return 3;
    }


// Recursion
        public static void count(int n) {
            if (n <= 0) {
                System.out.println("All done!");
                return;
            }
            System.out.println(n);
            count(n - 1);
        }

}
