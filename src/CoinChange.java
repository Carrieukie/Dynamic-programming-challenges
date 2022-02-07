public class CoinChange {
   static int number = 0;

    public static void main(String[] args) {
        System.out.println("hvg8t6768v-jjbh".replace("-","").toUpperCase());
//       coinChange(new int[]{1,3,5}, 6);
//        System.out.println(number);
    }

    public static void coinChange(int[] coins, int amount) {
        if (amount < 0) return ;
        if (amount == 0) {
            ++number;
        }
        for (int coin : coins) {
            int remainder = amount - coin;
             coinChange(coins, remainder);
        }
    }
}
