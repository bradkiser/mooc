// Create a program that asks the user to input numbers (integers).
// The program prints "Type numbers” until the user types the number -1.
// When the user types the number -1, the program prints "Thank you and see you later!" and ends.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Type numbers: ");

        while (true) {
            int input = Integer.parseInt(reader.nextLine());

            if (input == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                count++;
                sum += input;

                if (input % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
