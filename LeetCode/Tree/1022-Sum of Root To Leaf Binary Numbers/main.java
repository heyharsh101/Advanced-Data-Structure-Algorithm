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
    public static int sumRootToLeaf(TreeNode root) {
        return DFS(root, 0);
    }

    private static int DFS(TreeNode root, int curr){
        if(root==null){
            return 0;
        }
        curr = curr *2 +root.val;
        if(root.left == null && root.right == null){
            return curr;
        }

        return DFS(root.left, curr) + DFS(root.right, curr);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        int result = sumRootToLeaf(root);
        System.out.println(result); // Output: 22
    }
}
