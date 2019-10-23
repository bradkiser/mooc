import java.util.ArrayList;

public class Suitcase {
    private final ArrayList<Thing> things;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        int currentWeight = this.getTotalWeight();

        if ((currentWeight + thing.getWeight()) < this.maxWeight) {
            things.add(thing);
        }
    }

    public int getTotalWeight() {
        int weight = 0;
        
        for (Thing thing : things) {
            weight += thing.getWeight();
        }

        return weight;
    }

    public int getCount() {
        int counter = 0;

        for (Thing i : this.things) {
            counter++;
        }

        return counter;
    }

    public String toString() {
        if (this.getCount() == 0) {
            return "empty (" + this.getTotalWeight() + " kgs)";
        } else if (this.getCount() == 1) {
            return this.getCount() + " thing (" + this.getTotalWeight() + " kgs)";
        } else {
            return this.getCount() + " things (" + this.getTotalWeight() + " kgs)";
        }
    }

    public void printThings() {
        for (Thing i : things) {
            System.out.println(i.toString());
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = null;

        if (things.size() > 0) {
            heaviest = things.get(0);

            for (Thing i : things) {
                if (heaviest.getWeight() < i.getWeight()) {
                    heaviest = i;
                }
            }
        }
        return heaviest;
    }
}