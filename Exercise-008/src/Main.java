// Create a program that asks the user for two integers and then prints their sum.
// Type a number:6
// Type another number:2
// Sum of the numbers:8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int var1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int var2 = Integer.parseInt(reader.nextLine());

        System.out.print("Sum of the numbers: " + (var1 + var2));
    }
}
