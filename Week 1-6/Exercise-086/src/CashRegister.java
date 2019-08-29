public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        double p = 2.50;

        if (cashGiven >= p) {
            cashInRegister += p;
            economicalSold++;
            return cashGiven -= p;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double p = 4.00;

        if (cashGiven >= p) {
            cashInRegister+= p;
            gourmetSold++;
            return cashGiven -= p;
        } else {
            return cashGiven;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        double p = 2.50;

        if (card.pay(p)) {
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double p = 4.00;

        if (card.pay(p)) {
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
}
  