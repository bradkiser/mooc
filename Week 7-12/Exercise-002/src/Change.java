public class Change {
    private final char toCharacter;
    private final char fromCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        return characterString.replace(fromCharacter, toCharacter);
    }
}