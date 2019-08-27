import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private int upperLimit;
    private int maxNumbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.upperLimit = 39;
        this.maxNumbers = 7;
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random randomizer = new Random();

        for (int i=0; i < this.maxNumbers; i++) {
            int draw = randomizer.nextInt(this.upperLimit) +1;
            
            while (containsNumber(draw)) {
                draw = randomizer.nextInt(this.upperLimit);
            }
            this.numbers.add(draw);
        }

    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}