// The program that comes with the exercise contains a command called drawNumber.
// It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible).
// Create a program that draws a number.
// Then the user has the chance to guess once, what the number is.
// The program should to print "The number is lesser",
// "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random r = new Random();

        int low = 0;
        int high = 100;
        int count = 0;
        int result = r.nextInt(high - low) + low;

        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());

        while (guess != result) {
            count++;
            if (guess > result) {
                System.out.println("The number is lesser, guesses made: " + count);
            } else {
                System.out.println("The number is greater, guesses made: " + count);
            }
            System.out.println("Guess a number:");
            guess = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Congratulations, your guess is correct!");
    }
}
