// Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward). 
// The method can use the method reverse (from assignment number 56. Reversing text) as a helper. 
// The method type is boolean, so it returns either true (the string is a palindrome) or false (the string is not a palindrome).


import java.util.Scanner;

public class Main {
    public static boolean palindrome(String text) {
        String reverse = "";
        int p = text.length() - 1;

        for (int i=0; i<text.length(); i++) {
            reverse+= text.charAt(p);
            p--;
        }

        if (reverse.equals(text)) {
            System.out.println("The text is a palindrome!");
            return true;
        } else {
            System.out.println("The text is not a palindrome!");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a text: ");
        String input = reader.nextLine();
        palindrome(input);
    }
}
