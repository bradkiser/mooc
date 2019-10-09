import java.util.Arrays;

public class Main{
        public static void main(String[] args) {
            int[] values = {8, 3, 7, 9, 1, 2, 4};
            sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i: array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];

        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap1;
        int swap2;

        swap1 = array[index2];
        swap2 = array[index1];

        array[index1] = swap1;
        array[index2] = swap2;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}