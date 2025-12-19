import java.util.Arrays;
public class main {
    // Recursion with Memoization - Top Down Approach
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return DP(m-1, n-1);
    }
    public int DP(int i, int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int up = DP(i-1, j);
        int left = DP(i, j-1);

        dp[i][j] = up + left;
        return dp[i][j];
    }
    public static void main(String[] args) {
        main m = new main();
        int m1 = 3;
        int n1 = 7;
        System.out.println(m.uniquePaths(m1, n1));
    }
}
