// The exercise file initially contains a program which prints:
// Chickens:
// 3
// Bacon(kg):
// 5.5
// A tractor:
// There is none!
//
// In a nutshell:
// 3
// 5,5
// There is none!

// Change the program in the specified places so that it will print:
// Chickens:
// 9000
// Bacon(kg):
// 0.1
// A tractor:
// Zetor
//
// In a nutshell:
// 9000
// 0.1
// Zetor

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        int chicken = 3;
        double bacon = 5.5;
        String tractor = "There is none!";

        System.out.println("Chickens:");
        System.out.println(chicken);
        System.out.println("Bacon(kg):");
        System.out.println(bacon);
        System.out.println("A tractor:");
        System.out.println(tractor);

        System.out.println("");
        System.out.println("In a nutshell:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);

        System.out.println("");

        chicken = 9000;
        bacon = 0.1;
        tractor = "Zetor";

        System.out.println("Chickens:");
        System.out.println(chicken);
        System.out.println("Bacon(kg):");
        System.out.println(bacon);
        System.out.println("A tractor:");
        System.out.println(tractor);

        System.out.println("");
        System.out.println("In a nutshell:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);
    }
}
