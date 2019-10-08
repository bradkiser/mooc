import java.util.ArrayList;
import java.util.Scanner;

public class BirdWatcher{
    private ArrayList<Bird> birdWatch;

    public BirdWatcher() {
        this.birdWatch = new ArrayList<Bird>();
    }

    public void addBird(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        
        Bird newBird = new Bird(name, latinName);
        this.birdWatch.add(newBird);
    }

    public ArrayList<Bird> getBird() {
        return this.birdWatch;
    }

    public void statistics() {
        for (Bird b: birdWatch) {
            System.out.println(b);
        }
    }

    public void observation(Scanner scanner) {
        System.out.print("What was observed? ");
        String name = scanner.nextLine();

        for (Bird b: birdWatch) {
            if (b.getName().equalsIgnoreCase(name) || b.getLatinName().equalsIgnoreCase(name)) {
                b.incrementCount();
                break;
            }
            System.out.println("Is not a bird!");
        }
    }

    public void showBird(Scanner scanner) {
        System.out.print("What? ");
        String name = scanner.nextLine();

        for (Bird b: birdWatch) {
            if (b.getName().equalsIgnoreCase(name) || b.getLatinName().equalsIgnoreCase(name)) {
                System.out.println(b.toString());
                break;
            }
            System.out.println("Is not a bird!");
        }
    }
}