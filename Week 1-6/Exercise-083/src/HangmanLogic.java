import java.util.Scanner;

public class HangmanLogic {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (this.guessedLetters.contains(letter)) {

        } else {
            if (this.word.contains(letter)) {

            } else {
                this.numberOfFaults++;
            }
            this.guessedLetters += letter;
        }

        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, the number of faults increases
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        String h = "";
        
        for (int i=0; i <this.word.length(); i++) {
            char guess = this.word.charAt(i);
            String letter = "" + guess;

            if (this.guessedLetters.contains(letter)) {
                h += letter;
            } else {
                h += "*";
            }
        }
        return h;
    }

}
