// Create a program that asks the user for the first number and the last number
// and then prints all numbers between those two.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First limit: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Second limit: ");
        int second = Integer.parseInt(reader.nextLine());

        while (first <= second) {
            System.out.println(first);
            first++;
        }
    }
}
