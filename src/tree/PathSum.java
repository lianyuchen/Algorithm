package tree;

import java.util.ArrayList;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class PathSum {

    /**
     * Given a binary tree and a sum,
     * determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
     For example:
     Given the below binary tree and sum = 22,
          5
         / \
        4   8
       /   / \
     11  13   4
    / \        \
   7   2        1
     return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
     */
    ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        //建立树
        TreeNode root = new TreeNode(5);
        TreeNode two = new TreeNode(4);
        TreeNode three = new TreeNode(8);
        TreeNode four = new TreeNode(11);
        TreeNode five = new TreeNode(13);
        TreeNode six = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(2);
        TreeNode nine = new TreeNode(1);
        root.left = two;
        root.right = three;
        two.left = four;
        two.right = null;
        three.left = five;
        three.right = six;
        four.left = seven;
        four.right = eight;
        five.left = null;
        five.right = null;
        six.left = null;
        six.right = nine;
        seven.left = null;
        seven.right = null;
        eight.left = null;
        eight.right = null;
        nine.left = null;
        nine.right = null;
        PathSum pathSum = new PathSum();

        System.out.print(pathSum.hasPathSum(root, 22));
//        pathSum.printList();
    }

    public void printList() {
        list.forEach(System.out::print);
    }

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) return false;

        if (root.left == null && root.right == null && root.val == sum){
//            list.add(root.val);
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
