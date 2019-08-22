// Implement the class Multiplier that has:
// A constructor public Multiplier(int number).
// A method public int multiply(int otherNumber) that returns otherNumber multiplied by number (i.e., the constructor parameter).
// Example of usage:
// Multiplier threeMultiplier = new Multiplier(3);
// System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

// Multiplier fourMultiplier = new Multiplier(4);
// System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

// System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
// System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    
// Output:

// threeMultiplier.multiply(2): 6
// fourMultiplier.multiply(2): 8
// threeMultiplier.multiply(1): 3
// fourMultiplier.multiply(1): 4

public class Multiplier {

    private int number; 

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int otherNumber) {
        return otherNumber * this.number;
    }

    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));
        
        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));
        
        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
}
