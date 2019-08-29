// Make a class Counter that holds a number that can be decreased and increased. 
// The counter also has an optional check that prevents the counter from going below 0. 

// The class has to have the following constructors:
// public Counter(int startingValue, boolean check) creates a new counter with the given value. The check is on if the parameter given to check was true.
// public Counter(int startingValue) creates a new counter with the given value. The check on the new counter should be off.
// public Counter(boolean check) creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
// public Counter() creates a new counter with the starting value of 0 and with checking off.

// and the following methods:
//public int value() returns the current value of the counter
//public void increase() increases the value of the counter by one
//public void decrease() decreases the value of the counter by one, but not below 0 if the check is on

public class Counter {
    private int value;
    private boolean check;

    public Counter() {
        this(0, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter (int startingValue) {
        this(startingValue, false);
    }

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public int value() {
        return this.value;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        } 
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check) {
                if ((this.value - decreaseAmount) < 0) {
                    this.value =0;
                } else {
                    this.value -= decreaseAmount;
                }
            } else {
                this.value -= decreaseAmount;
            }
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}