// Create a method printStars that prints the given amount of stars and a line break.
// Create the method in the following body:
// *****
// ***
// *********

// Create a method printSquare(int sideSize) that prints a square using our previous method printStars.
// The method call printSquare(4), for example, prints the following:
// ****
// ****
// ****
// ****

// Create a method printRectangle(int width, int height) that prints a rectangle using the printStars method.
// The call printRectangle(17,3), for example, has the following output:
// *****************
// *****************
// *****************

// Create the method printTriangle(int size) that prints a triangle using the printStars method.
// The method call printTriangle(4), for example, has the following output:
// *
// **
// ***
// ****


public class Main {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("");

        printSquare(4);

        System.out.println("");

        printRectangle(17, 3);

        System.out.println("");

        printTriangle(4);
    }

    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    private static void printSquare(int sides) {
        int i = 0;

        while (i < sides) {
            printStars(sides);
            i++;
        }
    }

    private static void printRectangle(int width, int height) {
        int i = 0;

        while (i < height) {
            printStars(width);
            i++;
        }
    }

    private static void printTriangle(int size) {
        int i = 0;

        while (i <= size) {
            printStars(i);
            i++;
        }
    }
}
