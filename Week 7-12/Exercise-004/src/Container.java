import java.util.ArrayList;

public class Container {
    private final int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = getWeight();

        weight += suitcase.getTotalWeight();

        if (weight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int getWeight() {
        int weight = 0;

        for (Suitcase i : this.suitcases) {
            weight += i.getTotalWeight();
        }

        return weight;
    }

    public int getCount() {
        int counter = 0;

        for (Suitcase i : this.suitcases) {
            counter++;
        }

        return counter;
    }

    public String toString() {
        return this.getCount() + " suitcases (" + this.getWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase i : this.suitcases) {
            i.printThings();
        }
    }
}