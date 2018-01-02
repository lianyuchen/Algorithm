package tree;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class DiameterOfBinaryTree {

    /**
     * Given a binary tree, you need to compute the length of the diameter of the tree.
     * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
     * This path may or may not pass through the root.

     Example:
     Given a binary tree
        1
       / \
      2   3
     / \
    4   5
     Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

     */

    public static void main(String[] args){

    }
    int distance = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        method(root);
        return distance;
    }

    private int method(TreeNode node){
        if(null == node){
            return 0;
        }
        int l = method(node.left);
        int r = method(node.right);
        if(l + r > distance){
            distance = l + r;
        }

        return Math.max(l, r) + 1;
    }
}
