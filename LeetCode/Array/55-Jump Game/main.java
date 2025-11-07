// Use mathematical greedy approach to determine if you can reach the last index of the array.
// Main :- Keep track of the maximum reachable index as you iterate through the array.
// If at any point the current index exceeds the maximum reachable index, return false.
// If you can iterate through the array without exceeding the maximum reachable index, return true.
// Time Complexity :- O(n), where n is the length of the input array.
// Space Complexity :- O(1), as we are using only a constant amount of extra space.

public class main {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxReach){
                return false;
            } else {
                maxReach = Math.max(maxReach, i+nums[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean result = canJump(nums);
        System.out.println(result);
    }
}
