// Create a program that prints the first part of a word.
// The program asks the user for the word and the length of the first part.
// Use the substring method in your program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the first part: ");
        int len = Integer.parseInt(reader.nextLine());

        System.out.print("Result: " + word.substring(0,len));
    }
}
