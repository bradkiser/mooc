
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.println("Seconds: ");
        int s = Integer.parseInt(reader.nextLine());

        System.out.println("Minutes: ");
        int m = Integer.parseInt(reader.nextLine());

        System.out.println("Hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            
            if (seconds.getValue() == 59) {
                seconds.setValue(0);
                
                if (minutes.getValue() == 59) {
                    if (hours.getValue() == 23) {
                        hours.setValue(0);
                    } else {
                        hours.next();
                    }
                } else {
                    minutes.next();
                }

            } else {
                seconds.next();
            }


            if (minutes.getValue() == 59) {
                if (hours.getValue() == 23) {
                    hours.setValue(0);
                } else {
                    minutes.next();
                    hours.next();
                }
            } else {
                minutes.next();

            }
            i++;
        }
    }
}
       