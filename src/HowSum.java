import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HowSum {
    public static void main(String[] args) {
        System.out.println(howSum(new int[]{4,3,1}, 6, new HashMap<>(),Integer.MAX_VALUE));
    }

    public static List<Integer> howSum(int[] numbers, int target, HashMap<Integer, ArrayList<Integer>> integerArrayListHashMap,int ans) {

        if (integerArrayListHashMap.containsKey(target)) return integerArrayListHashMap.get(target);
        if (target < 0) return null;
        if (target == 0) return new ArrayList<>();
        for (Integer num : numbers) {
            int remainder = target - num;
            List<Integer> remainderResult = howSum(numbers, remainder, integerArrayListHashMap,ans);
            if (remainderResult != null) {
                remainderResult.add(num);
                integerArrayListHashMap.put(target, (ArrayList<Integer>) remainderResult);
                ans = Math.max(remainderResult.size(),ans);
//                return remainderResult;
            }else{
                integerArrayListHashMap.put(target, null);
            }
        }
        System.out.println(ans);
        return null;

    }
}
