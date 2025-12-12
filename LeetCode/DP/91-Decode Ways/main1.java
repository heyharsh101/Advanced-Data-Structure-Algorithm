import java.util.Arrays;
public class main1 {
    // DP solution - Top Down technique
    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return recursion(0, s, dp);
    }
    public static int recursion(int i, String s, int[] dp) {
        int n = s.length();
        if(i==n) return 1;
        if(s.charAt(i)== '0') return 0;
        
        if(dp[i] != -1) return dp[i];

        int ways = recursion(i+1, s, dp);

        if(i +1 <n){
            int two = Integer.parseInt(s.substring(i, i+2));
            if(two >=10 && two <=26){
                ways += recursion(i+2, s, dp);
            }
        }
        dp[i] = ways;
        return ways;
    }
    public static void main(String[] args) {
        String[] tests = {"12", "226", "0", "06", "11106"};
        for (String t : tests) {
            System.out.println("s=\"" + t + "\" -> " + numDecodings(t));
        }
    }
}
