public class Main {
    // Simple DP solution for "Climbing Stairs" (number of ways to climb n steps
    // when you can take 1 or 2 steps at a time).
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] tests = {2, 3, 5, 10};
        for (int t : tests) {
            System.out.println("n=" + t + " -> " + climbStairs(t));
        }
    }
}public class Main {
    // Simple DP solution for "Climbing Stairs" (number of ways to climb n steps
    // when you can take 1 or 2 steps at a time).
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] tests = {2, 3, 5, 10};
        for (int t : tests) {
            System.out.println("n=" + t + " -> " + climbStairs(t));
        }
    }
}