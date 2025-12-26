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
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root== null) return null;

        if(root.val < val) {
            return searchBST(root.right, val);
        } else if(root.val > val){
            return searchBST(root.left,val);
        } else {
            return root;
        }
    }
    public void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        main solution = new main();
        int valToSearch = 2;
        TreeNode result = solution.searchBST(root, valToSearch);
        if (result != null) {
            solution.preorder(result); // Output the subtree rooted at th found node
        } else {
            System.out.println("Value not found in the BST.");
        }
    }
}
