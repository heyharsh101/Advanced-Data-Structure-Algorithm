import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class main {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
    public static void preorder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
    public static void main(String[] args) {
        int[] arr = {1, null, 2, 3};
        main obj = new main();
        TreeNode root = obj.buildTree(arr);
        List<Integer> result = obj.preorderTraversal(root);
        System.out.println(result);
    }
}
