// Use HashMap to store the last seen index of each number
// Check if the current number has been seen before and if the index difference is within k
// If yes, return true; otherwise, update the index in the map
// If no such pair is found, return false

// Time Complexity: O(n)
// Space Complexity: O(n)
// LeetCode Problem: https://leetcode.com/problems/contains-duplicate-ii/
// 

import java.util.HashMap;
public class main {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int prevIndex = map.get(nums[i]);
                if(i - prevIndex <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
    return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
