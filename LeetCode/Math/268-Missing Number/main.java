// Optimal Approach
// Use the formula of sum of n natural numbers
public class main {
    public int missingNumber(int[] nums){
        int n= nums.length;
        int sum = n*(n+1)/2;
        int count =0;
        for(int i=0; i<n; i++){
            count = count + nums[i];
        }
        return sum - count;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        main obj = new main();
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }
}
