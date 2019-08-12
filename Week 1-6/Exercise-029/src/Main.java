// Create a program that prints all even numbers between 2 and 100.

public class Main {
    public static void main(String[] args) {
        int num = 2;
        int max = 100;

        while (num <= max) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
