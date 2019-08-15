// Create the method public static int countItems(ArrayList<String> list) that returns the number of the items
// in the list. Your method should not print anything.
// Use a return statement to return the number as shown in the following example:

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int countItems(ArrayList<String> items) {
        int count = 0;

        for (String i : items) {
            count++;
        }

        return count;
    }

    public static void removeLast(ArrayList<String> items) {
        int l = items.size();
        items.remove(l - 1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<String>();

        while (true) {
            System.out.print("Enter an item: ");
            String item = reader.nextLine();

            if (item.isEmpty()) {
                break;
            } else {
                if (items.contains(item)) {
                    System.out.println("The list already contains the item");
                } else {
                    items.add(item);
                }
            }
        }

        System.out.println("Number of items " + countItems(items));
        System.out.println("Removing last item: " + items.get(items.size()-1));
        removeLast(items);
        System.out.println("Number of items " + countItems(items));
    }
}
