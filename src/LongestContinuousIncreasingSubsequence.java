public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(longestSubsequence(new int[]{1,3,5,4,7}));
    }

    public static int longestSubsequence(int[] nums) {

        int startPos = 0;
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
//            it should be continous
            if (nums[i] <= nums[i - 1]){
                startPos = i;
            }
            result = Math.max(result, i - startPos + 1);
        }
        return result;

    }
}
