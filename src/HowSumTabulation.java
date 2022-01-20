import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HowSumTabulation {

    public static void main(String[] args) {
        System.out.println(howSum(new int[]{5,4,3,2,1}, 7));
    }

    public static List<Integer> howSum(int[] numbers, int target) {

        int[] dp = new int[target + 1];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < target + 1; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int possibleTarget = dp[i] + numbers[j];
                if (possibleTarget <= target) {
                    dp[possibleTarget] = possibleTarget;
                    if (map.containsKey(possibleTarget)){
                        map.get(possibleTarget).add(numbers[j]);
                    }else {
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(dp[i]);
                        arr.add(numbers[j]);
                        map.put(possibleTarget,arr);
                    }
                }
                if (possibleTarget == target){
                    return map.get(target);
                }
            }
        }
        System.out.println(map);
        return null;
    }

}
