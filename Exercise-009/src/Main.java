// Create a program that asks the user for two integers and prints their quotient. Make sure that 3 / 2 = 1.5.
// If the decimal part is missing, take another look at 5.1
// Floating point numbers (decimal numbers) to find the solution.Type a number: 3
// Type another number:2
// Division:3/2=1.5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int var1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int var2 = Integer.parseInt(reader.nextLine());

        System.out.println("Division: " + var1 + "/" + var2 + " = " + ((double) var1 / var2));
    }
}
