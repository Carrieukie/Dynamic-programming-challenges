import java.util.HashMap;

public class CanConstructTabulation {

    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", new String[]{"abc", "cd", "ef", "def", "eee"}));
    }

    public static boolean canConstruct(String string, String[] array) {
        boolean[] dp = new boolean[string.length() + 1];
        dp[0] = true;
        for (int i = 0; i < string.length(); i++) {
            if (dp[i]){
                for (String word : array){
                    if (word.equals(string.substring(i, i + word.length()))){
                        dp[i + word.length()] = true;
                    }
                }
            }

        }
        return dp[string.length()];
    }
}
