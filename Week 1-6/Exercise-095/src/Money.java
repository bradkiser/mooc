public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money sum = new Money(this.euros+added.euros, this.cents + added.cents);
        return sum;
    }

    public boolean less(Money compared) {
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }

        if (this.euros < compared.euros) {
            return true;
        }

        return false;
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            return new Money(0, 0);
        } else {
            int euros = this.euros - decremented.euros;
            int cents = this.cents - decremented.cents;

            if (this.cents < decremented.cents) {
                euros--;
                cents = 100 - decremented.cents;
            }
            return new Money(euros, cents);
        }
    }
}