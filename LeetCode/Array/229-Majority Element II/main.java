import java.util.ArrayList;
import java.util.List;
public class main {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        int candidates1 = 0; int candidates2 = 0;
        int count1 = 0; int count2 = 0; 
        
        for(int num : nums){
            if(num == candidates1) count1++;
            else if(num == candidates2) count2++;
            else if(count1 == 0){
                candidates1 = num;
                count1 = 1;
            } else if(count2 == 0){
                candidates2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == candidates1) count1++;
            else if(num == candidates2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        if(count1 > n/3) result.add(candidates1);
        if(count2 > n/3) result.add(candidates2);

        return result;
    }
    public static void main(String[] args) {
        main solution = new main();
        int[][] tests = {
            {3,2,3},
            {1},
            {1,2},
            {1,1,1,3,3,2,2,2},
            {2,2}
        };
        for (int[] t : tests) {
            System.out.print("nums=[");
            for (int num : t) {
                System.out.print(num + " ");
            }
            System.out.println("] -> " + solution.majorityElement(t));
        }
    }
}
