
public class main {
    public int arrayPairSum(int[] nums) {
        int OFFSET = 10000;
        int[] count = new int[20001];

        for(int num : nums){
            count[num + OFFSET]++;
        }

        int sum = 0;
        boolean take = true;

        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                if(take) {
                    sum = sum + i - OFFSET;
                }
                take = !take;
                count[i]--;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        main m = new main();
        int[] nums = {1,4,3,2};
        System.out.println(m.arrayPairSum(nums));
    }
}
