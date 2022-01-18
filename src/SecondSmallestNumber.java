public class SecondSmallestNumber {

    public static void main(String[] args) {
        System.out.println(secondSmallest(new int[]{5,4,3,2,1,6,7}));
    }

    public static int secondSmallest(int[] array){

        int smallest = array[0];
        int smaller = smallest;

        for (int i : array){
            if (smallest > i){
                smaller = smallest;
                smallest = i;
            }
        }
        return smaller;
    }

}
