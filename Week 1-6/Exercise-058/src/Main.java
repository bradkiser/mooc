// Create a program that asks the user to input words until the user gives the same word twice.
// Use an ArrayList structure in your program.ArrayList is defined like this:

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                break;
            } else {
                if (words.contains(word)) {
                    System.out.println("You gave the word " + word + " twice.");
                    break;
                } else {
                    words.add(word);
                }
            }
        }

        for (String i : words) {
            System.out.println("You gave the following word: " + i);
        }
    }
}
