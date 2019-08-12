//Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.println("Lower bound: ");
        int lowerBound = Integer.parseInt(reader.nextLine());


        System.out.println("Until what? ");
        int upperBound = Integer.parseInt(reader.nextLine());

        while (lowerBound <= upperBound) {
            sum += lowerBound;
            lowerBound++;
        }

        System.out.println(sum);
    }
}
