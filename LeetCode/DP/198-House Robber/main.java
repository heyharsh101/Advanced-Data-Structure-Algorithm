public class main {
    
    public static int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];

        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for(int i=2; i < n; i++){
            int rob = nums[i] + prev2;
            int skip = prev1;
            int curr = Math.max(rob, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
