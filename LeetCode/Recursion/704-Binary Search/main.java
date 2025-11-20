class main{
    public int search(int[] nums, int target) {
        return rec_sear(nums, 0, nums.length-1, target);
    }

    public int rec_sear(int[] nums, int left, int right, int target){
        if(left > right){
            return -1;
        }
        int mid = left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return rec_sear(nums, mid+1, right, target);
        } else {
            return rec_sear(nums, left, mid-1, target);
        }
    }

    public static void main(String[] args) {
        main obj = new main();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = obj.search(nums, target);
        System.out.println("Index of target " + target + " is: " + result);
    }
}