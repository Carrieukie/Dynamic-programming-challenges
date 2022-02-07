/**
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * <p>
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 105
 */
public class Jumpgame {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3, 2, 1, 0, 5}));
    }


    public static boolean canJump(int[] nums) {

        int bestPositionSoFar = 0;
        int ans = 0;

        //Loop cannot go beyond the best position so far
        for (int i = 0; i <= bestPositionSoFar; i++) {
            int possibleBest = nums[i] + i;
            if (bestPositionSoFar < possibleBest) {
                bestPositionSoFar = possibleBest;
                ans++;
            }
            if (bestPositionSoFar >= nums.length - 1) {
                return true;
            }
            System.out.println(ans + 1);
        }


        return false;

    }

}
