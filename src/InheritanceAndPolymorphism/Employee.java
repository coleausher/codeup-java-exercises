package InheritanceAndPolymorphism;

public class Employee extends Person {
    public Employee(String employeeName) {
        super(employeeName);
    }

    public void doWork() {
        System.out.println("Work, work, work.....");
    }

    public void sayHello() {
        System.out.println("Employee Greeting from " + name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Johnny");
        Person person1 = new Person("Cole");
        employee1.sayHello();
        employee1.doWork();
        person1.sayHello();


        System.out.println(employee1.name);
    }
}
