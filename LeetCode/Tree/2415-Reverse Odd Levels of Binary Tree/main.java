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
    public static TreeNode reverseOddLevels(TreeNode root) {
        if(root == null){
            return root;
        }
        DFS(root.left, root.right, 1);
        return root;
    }

    public static void DFS(TreeNode left, TreeNode right, int Level){
        if(left ==null || right == null){
            return;
        }

        if(Level % 2 == 1 ){
            int Temp = left.val;
            left.val = right.val;
            right.val = Temp;
        }
        DFS(left.left, right.right, Level +1);
        DFS(left.right, right.left, Level +1);
    }
    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);

        TreeNode result = reverseOddLevels(root);
        // You can add code here to print the tree or verify the result
        printTree(result);

    }
}
