import java.util.Random;

public class PasswordRandomizer {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz123456789";
    private int length;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";

        for (int i=0; i < length; i++) {
            password += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return password;
    }
}