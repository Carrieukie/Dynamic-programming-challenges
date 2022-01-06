public class CanSum {
    public static void main(String[] args) {
        System.out.println(canSum(new int[]{90,1}, 8));
    }

    public static  boolean canSum(int[] arr, int target){

        if (target < 0) return false;
        if (target == 0) return true;

        for (int num : arr){
            int remainder = target - num;
            if (canSum(arr, remainder)) return true;
        }
        return false;
    }
}
