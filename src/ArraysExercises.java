import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Main {
        public void main(String[] args) {
            Person[] people = new Person[3];
            people[0] = new Person("Alice");
            people[1] = new Person("Bob");
            people[2] = new Person("Charlie");

            for (Person person : people) {
                System.out.println(person.getName());
            }

        }
        public static Person[] addPerson(Person[] people, Person newPerson) {
            Person[] newPeople = new Person[people.length + 1];
            for (int i = 0; i < people.length; i++) {
                newPeople[i] = people[i];
            }
            newPeople[newPeople.length - 1] = newPerson;
            return newPeople;
        }
        Person[] originalPeople = { new Person("Alice"), new Person("Bob"), new Person("Charlie") };
        Person newPerson = new Person("Dave");
        Person[] newPeople = addPerson(originalPeople, newPerson);
    }
}