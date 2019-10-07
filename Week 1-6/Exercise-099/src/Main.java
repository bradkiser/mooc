public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for(int i: array) {
            int counter = 0;

            while (counter < i) {
                System.out.print("*");
                counter++;
            }
            
            System.out.println();
        }
    }
}