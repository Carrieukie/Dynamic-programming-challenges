import java.util.Arrays;
import java.util.Random;

public class EggDrop {
    public static void main(String[] args) {
        var rn = new Random();
        System.out.println(superEggDrop(1,7));
    }

    public static int superEggDrop(int E, int F) {
        int[][] floors = new int[F+1][E+1];

        for (int d=1; d<=F; d++) {
            for (int e=1; e<=E; e++) {

                floors[d][e] = 1 + floors[d-1][e-1] + floors[d-1][e];

                if (floors[d][e] >= F) {
                    for (int[] arr : floors){
                        System.out.println(Arrays.toString(arr));
                    }
                    return d;
                }
            }
        }

        return -1;
    }

}
