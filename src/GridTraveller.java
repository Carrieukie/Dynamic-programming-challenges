import java.util.HashMap;

public class GridTraveller {
    public static void main(String[] args) {
        System.out.println(numways(3,3, new HashMap<>()));
    }

    public static long numways(long m, long n, HashMap<String,Long> map){
        String key = m < n ?  m + "," + n :n + "," + m;;
        System.out.println(key);
        if (n == 0 || m == 0) return 0;
        if (n == 1 || m == 1) return 1;
        if (n == 2) return m;
        if (m == 2) return n;

        if (map.containsKey(key)) {
            map.get(key);
        }else {
            map.put(key ,numways(m, n -1,map) + numways(m - 1,n, map));
        }
        System.out.println(map);
        return map.get(key);
    }
}
