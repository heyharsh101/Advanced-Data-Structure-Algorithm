// first initialize two pointers left and right at the beginning and end of the array respectively.
// then calculate the area formed between the two lines pointed by the pointers and update the maximum area if the current area is larger.

public class main {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxwater =0;
        while(left<=right){
            int width = right-left;
            int ht = Math.min(height[left], height[right]);
            int ans = width * ht;
            maxwater = Math.max(maxwater, ans);
            
            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
