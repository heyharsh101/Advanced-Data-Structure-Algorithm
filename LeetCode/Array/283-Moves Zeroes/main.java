// This is direct approach where we are using extra array to store non-zero elements

public class main {
    public static void moveZeroes(int[] nums){
        int n = nums.length;
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
