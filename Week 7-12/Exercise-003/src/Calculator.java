public class Calculator {
    private Reader reader;
    private int calculations;

    public Calculator() {
        this.reader = new Reader();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();

        System.out.println("sum of the values: " + (value1 + value2));

        this.calculations++;
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();

        if (value1 > value2) {
            System.out.println("difference of the values: " + (value1 - value2));
        } else {
            System.out.println("difference of the values: " + (value2 - value1));
        }
        this.calculations++;
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();

        if (value1 != 0 && value2 != 0) {
            System.out.println("product of the value: " + (value1 * value2));
            this.calculations++;
        }
    }

    private void statistics() {
        System.out.println("Calculation done: " + this.calculations);
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equalsIgnoreCase("end")) {
                break;
            }

            if (command.equalsIgnoreCase("sum")) {
                sum();
            } else if (command.equalsIgnoreCase("difference")) {
                difference();
            } else if (command.equalsIgnoreCase("product")) {
                product();
            }
        }

        statistics();
    }
}