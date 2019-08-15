// Create the method average, which receives a list of numbers (ArrayList<Integer>) as a parameter
// and then calculates the average of the items in that list.
//
// Note: the method should use the method sum from the previous exercise to calculate the sum of the parameters.
// Create the method using the following program body:

import java.util.ArrayList;

public class Main {
    public static double average(ArrayList<Integer> list) {
        double sum = 0;

        for (int i : list) {
            sum += i;
        }

        return sum / (double) list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

}
