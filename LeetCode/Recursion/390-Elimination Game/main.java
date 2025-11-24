
public class main {
    public static boolean predictTheWinner(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = winner(nums, left, right);
        return result>=0;
    }
    public static int winner(int[] nums, int left , int right){
        if(left == right){
            return nums[left];
        }
        int takeleft = nums[left] - winner(nums, left + 1, right);

        int takeright = nums[right] - winner(nums, left, right - 1);

        return Math.max(takeleft, takeright);
    }
    
    public static void main(String[] args) {
        int nums = {1, 5, 3};
        main main = new main();
        boolean ans = main.predictTheWinner(nums);
        System.out.println(ans);
    }
}
