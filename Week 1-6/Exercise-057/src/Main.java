// Create a program that asks the user to input words until the user types in an empty String.
// Then the program prints the words the user gave.
// Try the for repetition sentence here.
// Use an ArrayList structure in your program. ArrayList is defined like this:

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                break;
            } else {
                words.add(word);
            }
        }

        for (String i : words) {
            System.out.println("You typed the following word: " + i);
        }
    }
}
