// Create a similar program as the previous one, but in which the words are printed in alphabetical order.

import java.util.ArrayList;
import java.util.Collections;
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

        Collections.sort(words);

        for (String i : words) {
            System.out.println(i);
        }
    }
}
