public class RecusionExperiments {
    public static void main(String[] args) {
        System.out.println(recurr(40));
    }

    private static int recurr( int target ){
        if (target < 1) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;

        return recurr(target - 2) + recurr(target - 1);
    }


}
