// Create a program that calculates the factorial of the number n.
// The factorial n!is calculated using the formula 1*2*3*...*n.
// For example 4! =1*2*3*4=24.Additionally,it is defined that 0! =1.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int factorial = 1;

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println(factorial);
    }
}
