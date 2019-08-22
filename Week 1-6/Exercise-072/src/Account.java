// You are handed a ready-made class Account along with your exercise files. 
// The object of the class Account represents a bank account that has a balance (meaning some amount of money). 
// The accounts are used as follows:

public class Account {
    private String name;
    private double balance; 

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    } 

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    public String toString() {
        return name + " balance: " + balance;
    }

}