import java.util.Collections;
import java.util.ArrayList;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card card: hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
        this.print();
    }

    @Override
    public int compareTo(Hand hand) {
        int thisValue = 0;
        int otherValue = 0;

        for(Card thisCard: this.hand) {
            thisValue += thisCard.getValue();
        }

        for(Card otherCard: hand.hand) {
            otherValue += otherCard.getValue();
        }

        return thisValue - otherValue;
    }

    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
         Collections.sort(this.hand, suitSorter);
    }
}