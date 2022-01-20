import java.util.HashMap;

public class CanConstructNumwaysTabulation {
    public static void main(String[] args) {
        System.out.println(canConstructNum("abcdef", new String[]{"abc", "cd", "ef", "def", "eee"}));
    }

    public static int canConstructNum(String string, String[] array) {
        int[] dp = new int[string.length() + 1];
        dp[0] = 1;
        for (int i = 0; i <= string.length(); i++) {
           for (String word : array){
               if (word.equals(string.substring(i, i + word.length()))){
                   dp[i + word.length()] += dp[i];
               }
           }
        }
        return dp[string.length()];
    }

}
