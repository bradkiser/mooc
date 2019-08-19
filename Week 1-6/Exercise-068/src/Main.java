// Create the method moreThanOnce that gets a list of integers and an integer (i.e. number) as parameter.
// If the number appears on the list more than once the method returns true and otherwise false.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int counter = 0;

        for (int i : list) {
            if (number == i) {
                counter++;
            }
        }

        return counter > 1;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }
}
