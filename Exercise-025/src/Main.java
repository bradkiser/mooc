//Create a program that asks the user for three numbers and then prints their sum.
// Use the following structure in your program:

// Scanner reader = new Scanner(System.in);
// int sum = 0;
// int read;

// WRITE YOUR PROGRAM HERE
// USE ONLY THE VARIABLES sum, reader AND read!
// System.out.println("Sum: " + sum);

// Type the first number: 3
// Type the second number: 6
// Type the third number: 12

//        Sum: 21

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);
    }
}
