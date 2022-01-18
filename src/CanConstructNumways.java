import java.util.HashMap;
/**
 * Given a string and an array, determine if the words from the array can produce the given word.
 */
public class CanConstructNumways {
    public static void main(String[] args) {
        System.out.println(canConstructNum("eeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeeef", "eeeee"}, new HashMap()));
    }

    public static int canConstructNum(String string, String[] array, HashMap<String, Integer> map) {

        if (string.length() == 0) return 1;
        if (map.containsKey(string)) return map.get(string);

        int ans = 0;
        for (String st : array) {
            if (string.startsWith(st)) {
                String remainder = string.substring(st.length());
                ans += canConstructNum(remainder,array,map);
            }
        }
        map.put(string,ans);
        return ans;
    }
}
