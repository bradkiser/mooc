// Create a program that prints the integers (whole numbers) from 1 to 100.
// The program output should be:
// 1
// 2
// 3
// (many rows of numbers here)
// 98
// 99
// 100

public class Main {
    public static void main(String[] args) {
        int num = 1;
        int max = 100;

        while (num <= max) {
            System.out.println(num);
            num++;
        }
    }
}
