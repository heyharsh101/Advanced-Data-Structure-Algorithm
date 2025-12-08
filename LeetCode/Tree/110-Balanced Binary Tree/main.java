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
    public static boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }
    public static int check(TreeNode root){
    if (root==null) {
        return 0;
    }

    int left = check(root.left);
    if (left == -1) {
        return -1;
    }

    int right = check(root.right);
    if (right == -1) {
        return -1;
    }
    if (Math.abs(left-right)>1) {
        return -1;
    }

    return Math.max(left, right) +1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        boolean result = isBalanced(root);
        System.out.println("Is the binary tree balanced? " + result); // Output: false
    }
}
