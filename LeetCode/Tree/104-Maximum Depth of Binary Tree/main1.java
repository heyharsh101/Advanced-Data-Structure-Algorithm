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

// DFS Approach

public class main1 {
    public int maxDepth(TreeNode root) {
        return DFS(root);
    }
    public int DFS(TreeNode root){
    if(root == null) return 0;

    int left = DFS(root.left);
    int right = DFS(root.right);

    return 1 + Math.max(left, right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        main1 obj = new main1();
        int depth = obj.maxDepth(root);
        System.out.println("Maximum Depth of Binary Tree: " + depth); // Output: 3
    }
}
