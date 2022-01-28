import java.util.Arrays;

public class CanSumTabulation {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            System.out.println( i + " " + canSum(new int[]{3,2}, i));
        }
    }

    public static boolean canSum(int[] arr, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (dp[i] && (i + arr[j]) < dp.length){
                    dp[i + arr[j]] = true;
                }
            }
        }

        return dp[target];
    }

}
