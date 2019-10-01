public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate clone = new MyDate(this.day, this.month, this.year);
        clone.advance(days);
        return clone;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day == 30) {
            this.day =1;

            if (this.month == 12) {
                this.month =1;
                this.year++;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }
    }

    public void advance(int numberOfDays) {
        int i=0;

        while (i < numberOfDays) {
            advance();
            i++;
        }
    }
}