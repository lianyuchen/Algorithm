package tree;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class SymmetricTree {
    /**
     * Given a binary tree, check whether it is a mirror of itself
     * (ie, symmetric around its center).

     For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

         1
        / \
       2   2
      / \ / \
     3  4 4  3
     But the following [1,2,2,null,3,null,3] is not:
        1
       / \
      2   2
       \   \
       3    3
     */
    public static void main(String[] args){

    }

    public boolean isSymmetric(TreeNode root) {
        if(null == root) return true;
        return isSameTree(root.left, root.right);
    }

    public boolean isSameTree(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return isSameTree(left.left, right.right) && isSameTree(left.right, right.left);
    }
}
