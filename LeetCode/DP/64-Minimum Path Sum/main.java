import java.util.Arrays;
// Recursion + Memoization Approach - only use right and down movements
// Bottom-up DP approach is more optimal for this problem
public class main {
    // int[][] dp;
    // int m, n;

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return DP(grid, 0, 0, dp, m, n);
    }
    public int DP(int[][] grid, int i, int j, int[][] dp, int m, int n){
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1) return grid[i][j];

        if(dp[i][j] != -1) return dp[i][j];

        int down = DP(grid, i+1, j, dp, m, n);
        int right = DP(grid, i, j+ 1, dp, m, n);

        dp[i][j] = grid[i][j] + Math.min(down, right);

        return dp[i][j];
    }
    public static void main(String[] args) {
        main m = new main();
        int[][] grid = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        System.out.println(m.minPathSum(grid));
    }
}
