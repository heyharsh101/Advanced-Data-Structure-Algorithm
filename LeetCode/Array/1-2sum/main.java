// used to find two indices of jnumbers in an array that add up to a specific target 
//
import java.util.Arrays;

public class main {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        main main = new main();
        int[] result = main.twoSum(nums, target);
        System.out.println("Result : "+ Arrays.toString(result));
    }
}
