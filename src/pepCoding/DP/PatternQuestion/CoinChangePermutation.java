package src.pepCoding.DP.PatternQuestion;

public class CoinChangePermutation {

    public static void main(String[] args) {
        int[] coins = {2, 3, 5, 6};
        int target = 10;

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for(int amount =1; amount <= target ;amount++){
            for(int coin: coins){
                if(coin <= amount){
                    dp[amount] += dp[amount-coin];
                }
            }
        }
        System.out.println(dp[target]);
    }
}
