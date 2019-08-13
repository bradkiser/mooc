// Create the method greatest,which gets three integers as parameters and then returns the greatest of them.
// If there are several parameters that are equally great, you can decide which one is returned.
// Printing should be done in the main program.

public class Main {
    public static int greatest(int number1, int number2, int number3) {
        int greatest = 0;

        if (number1 > number2) {
            if (number1 > number3) {
                greatest = number1;
            } else {
                greatest = number3;
            }
        } else if (number2 > number3) {
            greatest = number2;
        } else {
            greatest = number3;
        }
        return greatest;
    }

    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
}
