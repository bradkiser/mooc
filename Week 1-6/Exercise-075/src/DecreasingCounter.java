// The starting point of this exercise is a partially implemented class DecreasingCounter:

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // Implement the method decrease() so that when called, the object variable this.value is decreased by one. 
        if (this.value > 0) {
            this.value--;
        } 
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = initialValue;
    }

}