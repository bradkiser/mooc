import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        Grades gradeDistribution = new Grades();

        System.out.println("Type exam scores, -1 completes: ");
        int score = Integer.parseInt(test.nextLine());

        while (score != -1){
            gradeDistribution.add(score);
            score = Integer.parseInt(test.nextLine());
        }

        gradeDistribution.print();

    }
}