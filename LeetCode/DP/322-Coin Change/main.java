import java.util.Arrays;
public class main {
    public static int coinChange(int[] coins, int amount) {
        int INF = (int)1e9;

        int[] dp = new int[amount+1];
        Arrays.fill(dp, INF);

        dp[0]=0;

        for(int i=1; i<=amount; i++){
            for(int coin : coins){
                if(i-coin >=0){
                    dp[i] = Math.min(dp[i], 1+dp[i-coin]);
                }
            }
        }

        if(dp[amount]==INF){
            return -1;
        } else {
            return dp[amount];
        }
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
