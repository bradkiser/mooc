import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        while (true) {
            System.out.print("Type a number: ");
            int input = Integer.parseInt(reader.nextLine());
            
            if (input == -1) {
                break;
            } else if (input % 2 ==0) {
                even.addNumber(input);
                stats.addNumber(input);
            } else {
                odd.addNumber(input);
                stats.addNumber(input);
            }
        }

        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
     }
}
