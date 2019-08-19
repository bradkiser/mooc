// Create the method greatest, which receives a list of numbers (ArrayList<Integer>) as a parameter
// and then returns the greatest number in the list as a return value.

import java.util.ArrayList;

public class Main {
    public static int greatest(ArrayList<Integer> list) {
        int g = 0;

        for (int i : list) {
            if (i > g) {
                g = i;
            }
        }
        return g;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
