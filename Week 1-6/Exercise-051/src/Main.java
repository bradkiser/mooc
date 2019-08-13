//Create a program that asks for the user's name and gives the first character.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        while (i < name.length()) {
            System.out.println("Character: " + name.charAt(i));
            i++;
        }
    }
}
