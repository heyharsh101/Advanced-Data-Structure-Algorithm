// use >> and & operators to count bits for efficiency
// & operator checks if the least significant bit is 1
// >> operator shifts bits to the right, effectively dividing by 2
public class main {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }

        return dp;
    }
    public static void main(String[] args) {
        main m = new main();
        int n = 5;
        int[] result = m.countBits(n);
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
