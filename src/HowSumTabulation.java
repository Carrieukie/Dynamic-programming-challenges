import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HowSumTabulation {

    public static void main(String[] args) {
        System.out.println(howSum(new int[]{5,4,3}, 7));
    }

    public static List<Integer> howSum(int[] numbers, int target) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        map.put(0,new ArrayList<Integer>());
        for (int i = 0; i <= target; i++) {
            if (map.get(i) != null){
                for (int num: numbers){
                    ArrayList<Integer> arr = (ArrayList<Integer>) map.get(i).clone();
                    arr.add(num);
                    map.put(num + i,arr);
                }
            }
        }
        return map.get(target);
    }


}
