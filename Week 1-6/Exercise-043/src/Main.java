// Create the method least, which returns the least of the numbers given as parameters.
// If the parameters are equal, you can decide which one is returned.

public class Main {
    public static int least(int num, int num2) {
        return (num > num2) ? num2 : num;
    }

    public static void main(String[] args) {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }
}
