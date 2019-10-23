import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private final HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public String translate(String word) {
        String wordFrom = stringCleaner(word);

        if (this.dict.containsKey(wordFrom)) {
            return this.dict.get(wordFrom);
        }

        return "Unknown word!";
    }

    public void add(String word, String translation) {
        String wordFrom = stringCleaner(word);
        String wordTo = stringCleaner(translation);
        this.dict.put(wordFrom, wordTo);
    }

    public String stringCleaner(String word) {
        if (word == null) {
            return "";
        }

        word = word.toLowerCase();
        return word.trim();
    }

    public int amountOfWords() {
        int total = 0;

        for (String key: this.dict.keySet()) {
            total++;
        }

        return total;
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<String>();

        for (String key: this.dict.keySet()) {
            translations.add(key + " = " + this.dict.get(key));
        }

        return translations;
    }
}