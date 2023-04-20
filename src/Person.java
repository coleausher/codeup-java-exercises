public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.sayHello(); // prints "Hello, my name is Alice"

        // Change the name and print again
        person.setName("Bob");
        person.sayHello(); // prints "Hello, my name is Bob"
    }

//    UNDERSTANDING REFERENCES

//    creates two Person objects with the same name "John" and compares their names using the '.equals' method (which compares string values). This should output true. However, then compares the two objects using the '==' operator, which checks if they are the exact same object. Since person1 and person2 are separate objects with different memory addresses, this should output false
Person person1 = new Person("John");
    Person person2 = new Person("John");
System.out.println(person1.getName().equals(person2.getName()));
System.out.println(person1 == person2);

// The code creates a Person object with the name "John", and then sets person2 to reference the same object as person1. Since they are both referencing the same object in memory, this should output true when comparing them with the '==' operator because peron2 is set to have the same value as peron1.
    Person person1 = new Person("John");
    Person person2 = person1;
System.out.println(person1 == person2);

// This code is similar where person2 is set to reference the same object as person1. The code then prints the names of both objects using the getName method, which should output "John" twice. Then, the code sets the name of person2 to "Jane". Since person1 and person2 are both referencing the same object in memory, both calls to getName after the name change should output "Jane" because we set person2 to the name JANE.
    Person person1 = new Person("John");
    Person person2 = person1;
System.out.println(person1.getName());
System.out.println(person2.getName());
person2.setName("Jane");
System.out.println(person1.getName());
System.out.println(person2.getName());



}