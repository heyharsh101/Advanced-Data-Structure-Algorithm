import java.util.Arrays;
public class main {
    public static int change(int amount, int[] coins) {
       
        int dp[] = new int[amount +1];
        
        dp[0]=1;

        for(int coin : coins){
            for(int i=1; i<=amount; i++){
                if(i-coin>=0){
                    dp[i]+= dp[i-coin];
                }
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        System.out.println(change(amount, coins));
    }
}
