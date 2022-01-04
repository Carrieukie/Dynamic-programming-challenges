/**
 * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * You can assume that you can always reach the last index.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * <p>
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 1000
 */
public class Jumpgame2 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 0, 1, 4}));
    }

    public static int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[nums.length];
        dp[nums.length -1 ] = 0;

        for (int i = nums.length - 2; i >=0 ; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = i = 1; j < Math.min(n-1, i + nums[i]) ; j++) {
                min = Math.min(min,dp[j]);
            }
            if (min != Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
        }

        return dp[0];

    }
}
