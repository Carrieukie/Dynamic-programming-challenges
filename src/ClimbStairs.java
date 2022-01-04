/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n < 1){
            return 0;
        }

        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int numsways[] = new int[n + 1];
        numsways[0] = 0;
        numsways[1] = 1;
        numsways[2] = 2;
        for (int i = 3; i < numsways.length; i++) {
            numsways[i] = numsways[i -1] + numsways[i - 2];
        }
        return numsways[n];

    }
}
