public class CoinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{5, 2, 1}, 11, 0));
    }

    public static int coinChange(int[] coins, int amount, int number) {
        if (amount < 0) return amount;
        if (amount == 0) return number;
        for (int coin : coins) {
            int remainder = amount - coin;
            int result = coinChange(coins, remainder, ++number);
            if (result > 0) {
                return result;
            }
            --number;
        }
        return -1;
    }
}
