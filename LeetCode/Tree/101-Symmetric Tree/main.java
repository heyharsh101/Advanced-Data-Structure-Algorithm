class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class main {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(TreeNode r1, TreeNode r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        return isMirror(r1.left, r2.right) && isMirror(r1.right, r2.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root)); // Output: true
    }
}
