import java.util.*;

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

    public static TreeNode solve(int[] nums, int left, int right){
        if(left > right) return null;

        int mid = left +(right-left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = solve(nums, left, mid - 1);
        node.right = solve(nums, mid + 1, right);

        return node;

    }
    
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        main solution = new main();
        TreeNode bstRoot = sortedArrayToBST(nums);


    }


    public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if(root==null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    
    while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> level = new ArrayList<>();

        for(int i=0; i<size; i++){
            
            TreeNode curr = queue.poll();
            level.add(curr.val);

            if(curr.left!=null)
                queue.offer(curr.left);
            if(curr.right!=null)
                queue.offer(curr.right);
        }
        result.add(level);
    }
    return result;
    }
}
