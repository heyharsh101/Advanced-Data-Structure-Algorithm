import java.util.Arrays;
import java.util.List;
public class main {
    // Bottom-up DP approach is more optimal for this problem
    // Recursion + Memoization Approach - only use down and diagonal movements
    int[][] dp;
    int m;
    public int minimumTotal(List<List<Integer>> triangle) {
        m = triangle.size();
        dp = new int[m][m];

        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }

        return DP(triangle, 0, 0);
    }
    public int DP(List<List<Integer>> triangle, int i, int j){
        if(i == m -1) return triangle.get(i).get(j);
        
        if(dp[i][j] != -1) return dp[i][j];

        int down = DP(triangle, i+1, j);
        int diagonal = DP(triangle, i+1, j+1);

        dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagonal);

        return dp[i][j];
    }
    public static void main(String[] args) {
        main m = new main();
        List<List<Integer>> triangle = List.of(
            List.of(2),
            List.of(3,4),
            List.of(6,5,7),
            List.of(4,1,8,3)
        );
        System.out.println(m.minimumTotal(triangle));
    }
}
