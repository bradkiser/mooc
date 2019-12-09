import java.util.ArrayList;
import java.util.Scanner;

public class AirportUI {
    private final ArrayList<Plane> plane;
    private final ArrayList<Flight> flight;
    private final Scanner reader;

    public AirportUI(Scanner reader) {
        this.plane = new ArrayList<Plane>();
        this.flight = new ArrayList<Flight>();
        this.reader = reader;
    }

    public void start() {
        airportPanel();
        flightPanel();
    }

    private void airportStatements() {
        System.out.println("Airport panel:");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Choose an operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    private void airportPanel() {
        while (true) {
            airportStatements();

            String command = this.reader.nextLine();
            command = cleanString(command);

            if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = cleanString(reader.nextLine());

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(cleanString(reader.nextLine()));

        Plane newPlane = new Plane(id, capacity);
        this.plane.add(newPlane);
    }

    private Plane getPlane(String id) {
        for (Plane pl : this.plane) {
            if (pl.getName().equals(id)) {
                return pl;
            }
        }
        return null;
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = cleanString(reader.nextLine());

        System.out.print("Give departure airport code: ");
        String origin = cleanString(reader.nextLine());

        System.out.print("Give destination airport code: ");
        String destination = cleanString(reader.nextLine());

        Plane lookupPlane = getPlane(id);

        Flight newFlight = new Flight(lookupPlane, origin, destination);
        this.flight.add(newFlight);
    }

    private String cleanString(String word) {
        return word.trim();
    }

    private void flightStatements() {
        System.out.println("Flight service:");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Choose an operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }

    private void flightPanel() {
        while (true) {
            flightStatements();

            String command = this.reader.nextLine();
            command = cleanString(command);

            if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlaneInfo();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private void printPlanes() {
        for (Plane pl: this.plane) {
            System.out.println(pl);
        }
    }

    private void printFlights() {
       for (Flight fl: this.flight) {
           System.out.println(fl);
       } 
    }

    private void printPlaneInfo() {
        System.out.println("Enter plane id: ");
        String id = cleanString(reader.nextLine());
        
        Plane lookupPlane = getPlane(id);
        System.out.println(lookupPlane);
    }
}