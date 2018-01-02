package tree;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class MinimumDepthOfBinaryTree {
    /**
     * Given a binary tree, find its minimum depth.

     The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     */

    public static void main(String[] args){

    }
    public int minDepth(TreeNode root) {

        if (null == root) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
