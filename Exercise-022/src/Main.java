//In this exercise we create a program that asks the user for a password.
// If the password is right, a secret message is shown to the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";

        while (true) {
            System.out.print("Type the password: ");
            String input = reader.nextLine();

            if (input.toLowerCase().equals(password)) {
                System.out.println("Right:");
                System.out.println("The secret is: jryy qbar!\n");
                break;
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
