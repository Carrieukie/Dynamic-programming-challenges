import java.util.HashMap;

public class GridTraveller {
    public static void main(String[] args) {
        System.out.println(numways(18,18, new HashMap<>()));
    }

    public static long numways(long m, long n, HashMap<String,Long> map){

        if (n == 0 || m == 0) return 0;
        if (n == 1 && m == 1) return 1;
        String key = m + "," + n;
        if (map.containsKey(key)) return map.get(key);
        map.put(key ,numways(m, n -1,map) + numways(m - 1,n, map));
        return map.get(key);
    }
}
