// Create a program that reads numbers from the user and prints their sum.
// The program should stop asking for numbers when user enters the number 0.
// The program should be structured like this:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int input = Integer.parseInt(reader.nextLine());

            if (input == -1) {
                break;
            } else {
                sum += input;
                System.out.println("Sum now: " + sum);
            }
        }
    }
}
