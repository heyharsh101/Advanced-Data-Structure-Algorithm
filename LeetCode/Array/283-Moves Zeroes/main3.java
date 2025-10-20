// Using ArrayList to store non-zero elements and then adding zeroes at the end

import java.util.ArrayList;

public class main3 {
    public static void moveZeroes(int[] nums){
        int n = nums.length;
        ArrayList<Integer> nums1 = new ArrayList<>();
        int zerocount =0;

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums1.add(nums[i]);
            } else {
                zerocount++;
            }
        }

        for(int i=0; i <zerocount; i++){
            nums1.add(0);
        }
        for(int i=0; i<n; i++){
            nums[i] = nums1.get(i);
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("Array after moving zeroes: ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
