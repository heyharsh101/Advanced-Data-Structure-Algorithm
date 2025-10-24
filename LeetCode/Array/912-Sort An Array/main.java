// Using Merge Sort to sort an array
// si - start index & ei - end index

public class main {
    public static int[] sortArray(int[] nums){
        divide(nums, 0, nums.length-1);
        return nums;
    }

    public static void divide(int[] nums, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(nums, si, mid);
        divide(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }

    public static void merge(int[] nums, int si, int mid, int ei){
        int[] merged = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<=mid && idx2<=ei){
            if(nums[idx1] <= nums[idx2]){
                merged[x] = nums[idx1];
                x++; idx1++;
            } else {
                merged[x++] = nums[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++] = nums[idx1++];
        }
        while(idx2<=ei){
            merged[x++] = nums[idx2++];
        }
        for(int i=0; i<merged.length; i++){
            nums[si + i] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        main sorter = new main();
        int[] sorted = sorter.sortArray(nums);
        for(int num : sorted){
            System.out.print(num + " ");
        }
    }
}
