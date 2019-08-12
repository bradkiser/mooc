//Create a program that recognizes the following users:
// Username 	Password
// alex 	mightyducks
// emily 	cat
// The program should check for the username and password as follows:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String alexPassword = "mightyducks";
        String emilyPassword = "cat";

        System.out.print("Typer your username: ");
        String username = reader.nextLine();

        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if ((username.toLowerCase().equals("alex") && password.toLowerCase().equals(alexPassword)) ||
                (username.toLowerCase().equals("emily") && password.toLowerCase().equals(emilyPassword))) {
            System.out.println("You are now logged into the system.");
        } else {
            System.out.print("Your username or password was invalid!");
        }
    }
}
