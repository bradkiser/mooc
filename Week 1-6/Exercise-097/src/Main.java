public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int counter = 0;
        for (int i: array) {
            counter++;

            if (counter == array.length) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
 