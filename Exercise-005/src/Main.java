// Create a program that counts how many seconds there are in a year.
// You can assume that a year consists of 365 days (therefore the year is not a leap year).
// The program should print the following:

public class Main {
    public static void main(String[] args) {
        int days = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;

        int hoursInYear = days * hoursInDay;
        int minutesInYear = hoursInYear * minutesInHour;
        int secondsInYear = minutesInYear * secondsInMinute;

        System.out.println("There are " + secondsInYear + " in a year");
    }
}
