import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students =  new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("name: " );
            String name = reader.nextLine();

            if (name != null && !name.isEmpty()) {
                System.out.println("studentNumber: " );
                String num = reader.nextLine();

                if (num != null && !num.isEmpty()) {
                    Student i = new Student(name, num);
                    students.add(i);
                } else {
                    break;
                }
            } else {
                break;
            }
        }   

        for (Student i: students) {
            System.out.println(i.toString());
        }

        System.out.println("Enter search criteria: ");
        String searchCriteria = reader.nextLine();

        for (Student i: students) {
            // String name = i.getName();
            if (i.getName().contains(searchCriteria)) {
                System.out.println(i.toString());
            }
        }
    }
}