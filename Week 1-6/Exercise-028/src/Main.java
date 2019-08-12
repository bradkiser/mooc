// Create a program that prints the integers (whole numbers) from 1 to 100.
// The program output should be:
// 100
// 99
// 98
// (many rows of numbers here)
// 3
// 2
// 1

public class Main {
    public static void main(String[] args) {
        int num = 100;
        int min = 1;

        while (num >= min) {
            System.out.println(num);
            num--;
        }
    }
}
