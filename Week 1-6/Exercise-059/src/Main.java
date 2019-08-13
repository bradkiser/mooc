// Create a program that asks the user to input words, until the user gives an empty string.
// Then the program prints the words the user gave in reversed order, the last word is printed first etc.

import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.println("You already entered " + word + " into the list");
                    break;
                } else {
                    words.add(word);
                }
            }
        }

        System.out.println("You typed the following words");

        int s = words.size() - 1;
        for (String i : words) {
            System.out.println(words.get(s));
            s--;
        }
    }
}
