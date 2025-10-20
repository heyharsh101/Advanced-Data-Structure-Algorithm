// This method is Two Pointer approach where we are swapping non-zero elements with zero elements in the same array

public class main2 {
    public static void moveZeroes(int[] nums){
        int n = nums.length;
        int j =0;
        for(int i =0; i<n; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
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
