// A year is a leap year if it is divisible by 4.
// But if the year is divisible by 100, it is a leap year only when it is also divisible by 400.
// Create a program that checks whether the given year is a leap year.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = Integer.parseInt(reader.nextLine());

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("The year is a leap year");
            } else {
                if (year % 400 == 0) {
                    System.out.println("The year is a leap year");
                } else {
                    System.out.println("The year is not a leap year");
                }
            }
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
