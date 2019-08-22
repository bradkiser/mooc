// The University of Helsinki students use a so-called Lyyra cards to pay for their meals in student cafeterias. 
// In this assignment, we implement the class LyyraCard that simulates the Lyyra card.

// Exercise 77.1: Class skeleton
// Start by adding the class LyyraCard to your project.
// Then implement the LyyraCard constructor that gets the starting balance of the card as parameter. 
// The card saves the balance in the object variable balance. 
// Implement also the toString method that returns a string of the form "The card has X euros".
// The skeleton of class LyyraCard looks like this:

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public double getBalance() {
        return this.balance;
    }

    public void payEconomical() {
        if (balance - 2.50 > 0) {
            this.balance -= 2.50;
        }
    }
    
    public void payGourmet() {
        if (balance - 4.00 > 0) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) { 
            if (balance + amount < 150) {
                this.balance += amount;
            } else {
                this.balance = 150;
            }
        }
    }

}