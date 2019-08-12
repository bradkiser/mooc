// Create a program that prints all whole numbers from 1to the number the user enters.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 1;

        System.out.print("Up to what number? ");
        int i = Integer.parseInt(reader.nextLine());

        while (num <= i) {
            System.out.println(num);
            num++;
        }
    }
}
