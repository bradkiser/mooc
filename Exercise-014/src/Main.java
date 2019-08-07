// Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).
// Type a number: 5
// The number is positive.

// Type a number: -2
// The number is not positive.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int var = Integer.parseInt(reader.nextLine());

        if (var > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.print("The number is negative");
        }
    }
}
