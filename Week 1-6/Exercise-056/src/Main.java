// Create the method reverse that puts the given string in reversed order.
// Use the following program body for the method:

// Hint: you probably need to build the reversed string character by character in your method.
// You can use a String-type variable as a helper during the building process.
// In the beginning, the helper variable should have an empty string of characters as a value.
// After this, new characters are added to the string one by one.

// String help = "";

// ...
// adding a character to the help variable
// help = help + character;

import java.util.Scanner;

public class Main {
    public static String reverse(String text) {
        int len = text.length();
        String t = "";

        for (int i = 0; i < text.length(); i++) {
            t = t + text.charAt(len - 1);
            len--;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();

        System.out.println("In reverse order: " + reverse(text));
    }

}
