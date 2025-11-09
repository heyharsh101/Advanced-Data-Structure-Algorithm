// First Approach: Sorting
// 
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class main {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        
        int klargest = nums[n-k+1];

        return klargest;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
    }
}
