// Create a program that asks the user for two integers and then prints the larger of the two.
// Tip: When you write Math. (that is, Math followed by a dot) in NetBeans,
// it shows you a bunch of available mathematical calculations.
// For example, Math.cos(10) calculates the cosine of the number 10.
// Try to find a suitable tool in Math to complete this exercise!
// If you cannot find anything suitable or do not know how to complete the exercise,
// skip the exercise for now. We will return to the matter later on.
// Type a number: 20
// Type another number: 14
// The bigger number of the two numbers given was: 20

import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: " );
        int var1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int var2 = Integer.parseInt(reader.nextLine());

        if (var1 > var2) {
            System.out.println("The bigger of the two numbers given was: " + var1);
        } else {
            System.out.println("The bigger of the two numbers given was: " + var2);
        }

    }

}
