import java.util.ArrayList;

public class Box implements ToBeStored {
    private final double maxWeight;
    private final ArrayList<ToBeStored> storage;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.storage = new ArrayList<ToBeStored>();
    }

    @Override
    public double weight() {
        double weight = 0.0;

        for (ToBeStored box: storage) {
            weight += box.weight();
        }

        return weight;
    }

    public void add(ToBeStored box) {
        double boxWeight = box.weight();

        if ((boxWeight + this.weight()) <= this.maxWeight) {
            this.storage.add(box);
        }
    }

    @Override
    public String toString() {
        int count = this.storage.size();
        double weight = this.weight();

        return "Box: " + count + " things, total weight: " + weight + " kg"; 
    }
}