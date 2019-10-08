import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdWatcher bw = new BirdWatcher();

        while (true) {
            System.out.println("?");
            String input = reader.nextLine();

            if (input.equalsIgnoreCase("Quit")) {
                break;
            } else if (input.equalsIgnoreCase("Add")) {
                bw.addBird(reader);
            } else if (input.equalsIgnoreCase("Observation")) {
                bw.observation(reader);
            } else if (input.equalsIgnoreCase("Statistics")) {
                bw.statistics();
            } else if (input.equalsIgnoreCase("Show")) {
                bw.showBird(reader);
            }
        }
    }
}