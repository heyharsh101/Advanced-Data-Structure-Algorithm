// 4. Recursively check the left and right subtrees of both nodes.

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

class main{
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static void main(String[] args) {
        // create tree nodes and test the isSameTree function here if needed
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);
        TreeNode q1 = new TreeNode(1);

        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);
        main solution = new main();
        System.out.println(solution.isSameTree(p1, q1));
    }
}