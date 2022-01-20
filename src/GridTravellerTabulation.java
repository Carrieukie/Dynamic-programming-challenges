import java.util.Arrays;
import java.util.HashMap;

public class GridTravellerTabulation {

    public static void main(String[] args) {
        System.out.println(numways(10, 10));
    }

    public static long numways(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[1].length; j++) {
                if (i == 1 && j == 1){
                }else {
                    dp[i][j] = dp[i -1][j] + dp[i][j -1];
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[m] [n];
    }


}
