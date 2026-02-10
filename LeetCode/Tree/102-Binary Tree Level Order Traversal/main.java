import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if(root==null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for(int i=0; i<size; i++){
            TreeNode curr = queue.poll();
            level.add(curr.val);

            if(curr.left!=null)
                queue.offer(curr.left);
            if(curr.right!=null)
                queue.offer(curr.right);
        }
        result.add(level);
    }
    return result;
    }
    public static void main(String[] args) {
        main solution = new main();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println(result); // Output: [[3], [9, 20], [15,7]]
    }
}
