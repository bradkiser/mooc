// Develop the program by adding the following feature:
// the main program should ask the user how many times the text should be printed
// (meaning how many times the method is called).


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        System.out.println("How many? ");
        int num = Integer.parseInt(reader.nextLine());

        while (i < num) {
            printText();
            i++;
        }

    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
