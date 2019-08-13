// Create a program that prints the end part of a word.
// The program asks the user for the word and the length of the end part.
// Use the substring method in your program.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type first word: ");
        String word = reader.nextLine();

        System.out.print("Type second word: ");
        String secondWord = reader.nextLine();

        if (word.indexOf(secondWord) != -1) {
            System.out.println("The word " + secondWord + " is in the word " + word);
        } else {
            System.out.println("The word " + secondWord + " is not in the word " + word);
        }

    }
}
