
public class main {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        int case1 = DP(nums, 0, n-2);
        int case2 = DP(nums, 1, n-1);

        return Math.max(case1, case2);
    }
    public int DP(int[] nums, int left, int right){
        int len = right - left+1;
        int[] dp = new int[len];

        dp[0] = nums[left];

        if(len == 1) return dp[0];

        dp[1] = Math.max(nums[left], nums[left+1]);

        for(int i=2; i<len; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[left+ i]);
        }
        return dp[len - 1];
    }
    public static void main(String[] args) {
        main solution = new main();
        int[][] tests = {
            {2,3,2},
            {1,2,3,1},
            {0},
            {1,2,3,4,5,6,7,8,9,10}
        };
        for (int[] t : tests) {
            System.out.print("nums=[");
            for (int num : t) {
                System.out.print(num + " ");
            }
            System.out.println("] -> " + solution.rob(t));
        }
    }
}
