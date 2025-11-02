// Use postorder in (Left, Right, Root) fashion

import java.util.*;
class TreeNode{
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
    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }
    public static void postorder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.left = new TreeNode(4);

        main solution = new main();
        List<Integer> result = solution.postorderTraversal(root);
        System.out.println(result);
    }
}
