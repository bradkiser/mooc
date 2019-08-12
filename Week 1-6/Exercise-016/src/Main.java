//Create a program that asks the user for a number and tells whether the number is even or odd.

// Type a number: 2
// Number 2 is even.

// Type a number: 7
// Number 7 is odd.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int var = Integer.parseInt(reader.nextLine());

        if (var % 2 == 0) {
            System.out.println("Number " + var + " is even");
        } else {
            System.out.println("Number " + var + " is odd");
        }
    }
}
