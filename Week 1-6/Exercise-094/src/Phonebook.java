import java.util.ArrayList;

public class Phonebook{
    private ArrayList<Person> people = new ArrayList<Person>();

    public void add(String name, String number) {
        Person x = new Person(name, number);
        people.add(x);
    }

    public void printAll() {
        for(Person i: people) {
            System.out.println(i.toString());
        }
    }

    public String searchNumber(String name) {
        for(Person i: people) {
            if (i.getName().equals(name)) {
                return i.getNumber();
        }
            return "Number not known";
        }     
    }
}