import java.util.Arrays;
public class main {
    // Recursion with Memoization - Top Down Approach
    int dp[];
    public int jump(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return DP(nums, 0);
    }
    public int DP(int[] nums, int idx){
        if(idx >= nums.length - 1){
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int min = Integer.MAX_VALUE;

        for(int jump=1; jump <= nums[idx]; jump++){
            int next = idx + jump;
            if (next < nums.length) {
                min = Math.min(min, 1 + DP(nums, next));
            }
        }
        dp[idx] = min;
        return min;
    }
    public static void main(String[] args) {
        main m = new main();
        int[] nums = {2,3,1,1,4};
        System.out.println(m.jump(nums));
    }
}
