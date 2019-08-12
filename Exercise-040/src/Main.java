// Create a method printWhitespaces(int size) that prints the given amount of whitespaces. Them method should not print a line break.
// Reimplement or copy the method printStars(int size) from the previous exercise.

// Create the method printTriangle(int size) that prints a triangle using the methods printWhitespaces and printStars.
// Note: do not print anything in the method itself, just call the helper methods to do the actual printing.
// For example, the method call printTriangle(4) has the following output:
//     *
//    **
//   ***
//  ****

// Create the method xmasTree(int height) that prints a Christmas tree using the methods printWhitespaces and
// printStars.
//
// A Christmas tree consists of a triangle of given height and a stand.
// The stand is two stars tall and three stars wide and it is located in the center of the bottom of the triangle.
// Note: do not print anything in the method itself, just call the helper methods to do the actual printing.
//
// The method call xmasTree(4),for example,has the following output:
//    *
//   ***
//  *****
// *******
//   ***
//   ***

public class Main {
    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    private static void printWhitespaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
    }

    private static void printTriangle(int size) {
        int s = size - 1;
        int i = 0;

        while (i < size) {
            printWhitespaces(s);
            printStars(i + 1);
            s--;
            i++;
        }
    }

    public static void printChristmasTree(int height) {
        int s = height;
        int i = 0;
        int stars = 1;

        while (i < height) {
            printWhitespaces(s);
            printStars(stars);
            s--;
            i += 1;
            stars += 2;
        }

        i = 0;
        int rows = 2;

        while (i < rows) {
            printWhitespaces(stars / 2-1);
            printStars(3);
            i++;
        }
    }

    public static void main(String[] args) {
        printTriangle(4);

        System.out.println("");

        printChristmasTree(4);

        System.out.println("");

        printChristmasTree(10);
    }
}
