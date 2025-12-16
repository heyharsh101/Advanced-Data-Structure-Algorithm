import java.util.*;
// Use HashMap to find all elements that appear more than n/3 times in the array
public class main {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                result.add(key);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        main obj = new main();
        int[] nums = {3,2,3};
        System.out.println(obj.majorityElement(nums));
    }
}
