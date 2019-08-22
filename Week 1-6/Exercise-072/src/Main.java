// You are handed a ready-made class Account along with your exercise files. 
// The object of the class Account represents a bank account that has a balance (meaning some amount of money). 
// The accounts are used as follows:


public class Main{
    public static void transfer(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);


        Account a = new Account("a", 100);
        Account b = new Account("b", 0);
        Account c = new Account("c", 0);
        
        transfer(a, b, 50);
        transfer(a, c, 25);

        System.out.println("A balance: " + a.balance());
        System.out.println("B balance: " + b.balance());
        System.out.println("C balance: " + c.balance());
    }
}