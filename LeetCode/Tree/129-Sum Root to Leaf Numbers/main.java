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
    public static int sumNumbers(TreeNode root) {
        return DFS(root, 0);
    }
    public static int DFS(TreeNode root, int totalsum){
        if(root==null){
            return 0;
        }

        totalsum = totalsum *10 + root.val;
        if(root.left ==null && root.right == null){
            return totalsum;
        }

        return DFS(root.left, totalsum) + DFS(root.right, totalsum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int result = sumNumbers(root);
        System.out.println(result); // Output: 25
    }
}
