
// Use DFS to calculate the depth of each subtree and update the diameter at each node.
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class main {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        DFS(root);
        return diameter;
    }
    public int DFS(TreeNode root){
        if(root==null) return 0;

        int left = DFS(root.left);
        int right = DFS(root.right);

        diameter = Math.max(diameter, left+right);

        return 1+Math.max(left, right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        main obj = new main();
        int result = obj.diameterOfBinaryTree(root);
        System.out.println(result); // Output: 3
    }
}
