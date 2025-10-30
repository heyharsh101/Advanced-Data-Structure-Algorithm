// Brute Force Approach
// Increse time complexity to O(n^2)

public class main1 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<=n; i++){
            int flag = 0;
            for(int j=0; j<n; j++){
                if(nums[j] == i){
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        main1 obj = new main1();
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }
}
