import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private final HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate key : owners.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<String>();

        for (RegistrationPlate key : owners.keySet()) {
            String ownerName = owners.get(key);

            if (!ownerList.contains(ownerName)) {
                ownerList.add(ownerName);
            }
        }

        for (String name: ownerList) {
            System.out.println(name);
        }
    }
}