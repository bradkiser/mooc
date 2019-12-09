public class Flight {
    private final Plane plane;
    private final String orignAirport;
    private final String destinationAirport;

    public Flight(Plane plane, String originAirport, String destinationAirport) {
        this.plane = plane;
        this.orignAirport = originAirport;
        this.destinationAirport = destinationAirport;
    }

    @Override
    public String toString() {
        return this.plane + " (" + this.orignAirport + " - " + this.destinationAirport + ")";
    }
}