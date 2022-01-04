/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
 * Example 2:
 *
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 3
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 */
public class HouseRobber2 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,1,1}));
    }

    public static int rob(int[] nums){

        if (nums == null) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return  Math.max(nums[0],nums[1]);
        if (nums.length == 3) return Math.max(nums[0],Math.max(nums[1],nums[2]));

        int[][] dp = new int[2][nums.length];

        //robbing first house
        dp[1][0] = nums[0];
        dp[1][1] = Math.max(nums[1], nums[0]);

        // not robbing first house
        dp[0][0] = nums[1];
        dp[0][1] = Math.max(nums[2], nums[1]);

        for (int i = 2, j = 3 ; i < nums.length -1 && j < nums.length ; i++ , j++) {
            //robbing including the first house
            dp[1][i] = Math.max(nums[i] + dp[1][i - 2], dp[1][i-1]);
            //robbing not including the first house
            dp[0][i] = Math.max(nums[j] + dp[0][i - 2], dp[0][i-1]);
        }

        return Math.max(dp[0][nums.length -2], dp[1][nums.length -2]);

    }
}
