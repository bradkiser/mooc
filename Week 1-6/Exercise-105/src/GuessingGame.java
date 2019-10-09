import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(upperLimit, lowerLimit);

        while (true) {
            int guess = average(lowerLimit, upperLimit);

            if (isGreaterThan(guess)) {
                lowerLimit = guess + 1;
            } else {
                upperLimit = guess;
            }

            if (lowerLimit == upperLimit) {
                System.out.println("The number you're thinking of is " + lowerLimit + ".");
                break;
            }
        }
    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println(
                "I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String input = reader.nextLine();

        if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
            return false;
        } else {
            return true;
        }
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }
}
