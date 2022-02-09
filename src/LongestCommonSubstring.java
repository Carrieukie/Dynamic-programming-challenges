import java.util.HashMap;

public class LongestCommonSubstring {

    // Function to find the length of the longest common subsequence of
    // sequences `X[0…m-1]` and `Y[0…n-1]`
    public static int LCSLength(String X, String Y, int m, int n, HashMap<String, Integer> dp)
    {

        String key = m + "," + n;
        if (dp.containsKey(key)) return dp.get(key);
        // return if the end of either sequence is reached
        if (m == 0 || n == 0) {
            return 0;
        }

        // if the last character of `X` and `Y` matches
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            int result = LCSLength(X, Y, m - 1, n - 1,dp) + 1;
            dp.put(key,result);
            return result;
        }

        // otherwise, if the last character of `X` and `Y` don't match
        int result = Integer.max(LCSLength(X, Y, m, n - 1,dp), LCSLength(X, Y, m - 1, n,dp));
        dp.put(key,result);
        return result;
    }

    public static void main(String[] args)
    {
        String X = "ABdvasdasdvsdvasdvvsdvasdvasCBDAB", Y = "BDCAasdvavsavssdavavasdvsdvBA";

        System.out.println("The length of the LCS is "
                + LCSLength(X, Y, X.length(), Y.length(),new HashMap<>()));
    }
}
