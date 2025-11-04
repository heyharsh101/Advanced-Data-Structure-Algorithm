// Use binary search to find the insert position of target in a sorted array.
// Main :- If the target is not found, the low pointer will indicate the correct insert position.

public class main {
    public static int searchinsert(int[] nums, int target){
        int low =0;
        int high = nums.length -1;

        while(low<=high){
            int mid = low+(high-low) /2;
            if(nums[mid]<target){
                low = mid +1;
            } else if(nums[mid]>target){
                high = mid -1;
            } else {
                return mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 2;
        int result = searchinsert(nums, target);
        System.out.println(result);
    }
}
