

class PersonLec {
        public String firstName;
        public String lastName;

        // instance method bc no 'static' after 'public'
        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
        }

//        constructors
        public PersonLec(){}

        public PersonLec(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

//

    // VISIBILITY





        public static void main(String[] args) {
            // instantiate a new person object
            PersonLec rick = new PersonLec();
            // assigning firstName field a value
            rick.firstName = "Rick";
            // assigning lastName field a value
            rick.lastName = "Sanchez";
            // executing the sayHello method
            System.out.println(rick.sayHello());


            PersonLec morty = new PersonLec();
            morty.firstName = "Morty";
            morty.lastName = "Smith";
            System.out.println(morty.sayHello());


            System.out.println(morty == rick);
        }

    }


