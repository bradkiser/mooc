// Create a program that gives the course grade based on the following table.
// Points 	Grade
// 0–29 	failed
// 30–34 	1
// 35–39 	2
// 40–44 	3
// 45–49 	4
// 50–60 	5

// Example outputs:
// Type the points [0-60]: 37
// Grade: 2

// Type the points [0-60]: 51
// Grade: 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());

        if (grade <= 29) {
            System.out.print("Grade: failed");
        } else if (grade >= 30 && grade < 35) {
            System.out.print("Grade: 1");
        } else if (grade >= 35 && grade < 40) {
            System.out.print("Grade: 2");
        } else if (grade >= 40 && grade < 45) {
            System.out.print("Grade: 3");
        } else if (grade >= 45 && grade < 50) {
            System.out.print("Grade: 4");
        } else {
            System.out.print("Grade: 5");
        }
    }
}
