package InheritanceAndPolymorphism;

public class SavingsAccount extends Bank {

    public int accountNumber;

    public SavingsAccount(String customer, int accountNumber) {
        super(customer);
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Cole", 12345);

        Bank bank1 = new Bank("Britanny");

        System.out.println(savings.accountNumber);
        System.out.println(savings.customer);
        System.out.println(bank1.customer);

    }


}
