//Create a program that asks the user for two numbers and prints the greater of those two.
// The program should also handle the case in which the two numbers are equal.

// Example outputs:
// Type the first number:5
// Type the second number:3
// Greater number:5
//
// Type the first number:5
// Type the second number:8
// Greater number:8
//
// Type the first number:5
// Type the second number:5
// The numbers are equal!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int var = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int var2 = Integer.parseInt(reader.nextLine());

        if (var > var2) {
            System.out.println("Greater number: " + var);
        } else if (var2 > var) {
            System.out.println("Greater number: " + var2);
        } else {
            System.out.print("The numbers are equal!");
        }
    }
}
