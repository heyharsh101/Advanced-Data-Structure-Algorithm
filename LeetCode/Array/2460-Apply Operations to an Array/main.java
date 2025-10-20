// LeetCode Problem 2460: Apply Operations to an Array

import java.util.Arrays;

public class main {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int i=0; i< n-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int[] num1 = new int[n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                num1[j] = nums[i];
                j++;
            }
        }
        while(j < n){
            num1[j] = 0;
            j++;
        }
        for(int i=0; i<n; i++){
            nums[i] = num1[i];
        }
        
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,1,1,0};
        main m = new main();
        int[] result = m.applyOperations(nums);
        System.out.print(Arrays.toString(result));
    //     for(int i=0; i<result.length; i++){
    //         System.out.print(result[i] + " ");
    }
}

// This solution first applies the specified operations on adjacent equal elements,
// then moves all zeros to the end of the array while maintaining the order of non-zero elements
// Finally, it returns the modified array.