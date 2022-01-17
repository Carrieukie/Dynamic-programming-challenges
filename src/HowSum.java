import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HowSum {
    public static void main(String[] args) {
        System.out.println(howSum(new int[]{14,7,}, 300, new HashMap<>()));
    }

    public static List<Integer> howSum(int[] numbers, int target, HashMap<Integer, ArrayList<Integer>> integerArrayListHashMap) {

        if (integerArrayListHashMap.containsKey(target)) return integerArrayListHashMap.get(target);
        if (target < 0) return null;
        if (target == 0) return new ArrayList<>();
        for (Integer num : numbers) {
            int remainder = target - num;
            List<Integer> remainderResult = howSum(numbers, remainder, integerArrayListHashMap);
            if (remainderResult != null) {
                remainderResult.add(num);
                integerArrayListHashMap.put(target, (ArrayList<Integer>) remainderResult);
                return remainderResult;
            }else{
                integerArrayListHashMap.put(target, null);
            }
        }
        return null;

    }
}
