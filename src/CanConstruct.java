/**
 * Given a string and an array, determine if the words from the array can prduce the given word.
 */
public class CanConstruct {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", new String[]{"ab", "abck", "cd", "def", "abc"}));
    }

    public static boolean canConstruct(String string, String[] array) {

        for (String st : array) {
            if (string.length() == 0) return true;
            if (string.startsWith(st)) {
                String remainder = string.substring(st.length());
                if (canConstruct(remainder, array)) return true;
            }
        }

        return false;

    }

}
