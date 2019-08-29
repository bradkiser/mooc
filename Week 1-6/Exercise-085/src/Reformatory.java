public class Reformatory {
    private int totalWeightsMeasured;

    public int weight(Person person) {
        this.totalWeightsMeasured++;

        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight();

        person.setWeight(weight + 1);
    }

    public int totalWeightsMeasured() {
        return this.totalWeightsMeasured;
    }
}