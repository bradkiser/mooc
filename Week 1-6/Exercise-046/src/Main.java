//Create a program that asks for the user's name and says how many characters the name contains.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        System.out.println("Number of characters: " + name.length());

    }
}
