// Create a program that asks for the names and ages of two users.After that the program prints the sum of their ages.

// Type your name:Matti
// Type your age:14

// Type your name:Arto
// Type your age:12

// Matti and Arto are 26years old in total.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());

        System.out.println(name1 + " and " + name2 + " are " + (age1 + age2) + " years old.");
    }
}
