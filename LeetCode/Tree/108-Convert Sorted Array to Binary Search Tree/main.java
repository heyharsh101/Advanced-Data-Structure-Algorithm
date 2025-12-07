
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class main {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums, 0, nums.length -1);
    }

    public static TreeNode solve(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = solve(nums, left, mid - 1);
        node.right = solve(nums, mid + 1, right);

        return node;

    }
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        main solution = new main();
        TreeNode bstRoot = sortedArrayToBST(nums);
        printInOrder(bstRoot);

    }
}
