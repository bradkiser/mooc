import java.util.HashMap;

public class PromissoryNote{
    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        String name = stringCleaner(toWhom);
        this.loans.put(name, value);
    }

    public double howMuchIsTheDebt(String stringName) {
        String name = stringCleaner(stringName);

        if (this.loans.containsKey(name)) {
            return this.loans.get(name);
        } else {
            return 0;
        }
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
}