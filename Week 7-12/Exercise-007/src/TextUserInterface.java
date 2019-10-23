import java.util.Scanner;

public class TextUserInterface {
    private final Dictionary dict;
    private final Scanner reader;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }

    public void start() {
        startStatements();

        while (true) {
            System.out.print("Statement: ");
            String statement = reader.nextLine();
            statement = stringCleaner(statement);

            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                add();
            } else if (statement.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown Statement");
            }
        }
    }

    public void startStatements() {
        System.out.println("Statements: ");
        System.out.println("     add - adds a word pair to the dictionary");
        System.out.println("     translate - asks for a word and prints the translation");
        System.out.println("     quit - quits the text user inferface");
        System.out.println("");
    }

    public void add() {
        System.out.print("In finnish: ");
        String finnishWord = reader.nextLine();
        finnishWord = stringCleaner(finnishWord);

        System.out.print("Translation: ");
        String englishWord = reader.nextLine();
        englishWord = stringCleaner(englishWord);

        this.dict.add(finnishWord, englishWord);
        System.out.println("");
    }

    public void translate() {
        System.out.print("Give a word: ");
        String finnishWord = reader.nextLine();
        finnishWord = stringCleaner(finnishWord);

        String key = dict.translate(finnishWord);
        System.out.println("Translation: " + key);
        System.out.println("");
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}