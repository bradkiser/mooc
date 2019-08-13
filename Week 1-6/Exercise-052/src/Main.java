// Create a program that asks for the user's name and prints it in reverse order.
// You do not need to create a separate method for this.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int len = name.length();

        while (i < name.length()) {

            System.out.println("Character: " + name.charAt(len - 1));
            len--;
            i++;

        }
    }
}
