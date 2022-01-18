import java.util.HashMap;

/**
 * Given a string and an array, determine if the words from the array can produce the given word.
 */
public class CanConstruct {
    public static void main(String[] args) {
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee"}, new HashMap()));
    }

    public static boolean canConstruct(String string, String[] array, HashMap<String,Boolean> map) {
        if (string.length() == 0) return true;
        if (map.containsKey(string)) return map.get(string);
        for (String st : array) {
            if (string.startsWith(st)) {
                String remainder = string.substring(st.length());
                if (canConstruct(remainder, array, map)) {
                    map.put(string,true);
                    return true;
                }
            }
        }
        map.put(string,false);
        return false;

    }

}
