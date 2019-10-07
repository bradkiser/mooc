public class StringUtil{

    public StringUtil() {

    }

    public static boolean included(String word, String searched) {
        if (word == null || searched == null || searched.isEmpty() || word.isEmpty()) {
            return false;
        }

        word = word.trim().toLowerCase();

        searched = searched.trim().toLowerCase();

        if (word.contains(searched)) {
            return true;
        } else {
            return false;
        }
    }

}