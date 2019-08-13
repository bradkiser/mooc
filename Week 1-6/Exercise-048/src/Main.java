//Create a program that asks for the user's name and gives the first character.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        System.out.println("First Character: " + name.charAt(name.length()-1));
    }
}
