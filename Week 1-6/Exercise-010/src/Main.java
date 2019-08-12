// The circumference of a circle is calculated using the formula 2 * pi * radius.
// Create a program that asks the user for the radius and then calculates the circumference using the given radius.
// Java already contains the value of pi in the Math.PI variable, which you can use in your calculation.
// Type the radius: 20
// Circumference of the circle: 125.66370614359172

import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a radius: ");
        int var = Integer.parseInt(reader.nextLine());

        double circumference = 2 * Math.PI * var;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
