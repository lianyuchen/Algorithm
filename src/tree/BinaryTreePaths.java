package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class BinaryTreePaths {
    /**
     * Given a binary tree, return all root-to-leaf paths.

     For example, given the following binary tree:

        1
      /   \
     2     3
      \
       5
     All root-to-leaf paths are:

     ["1->2->5", "1->3"]
     Credits:
     Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
     */

    public static void main(String[] args){

    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();
        if (root != null){
            searchBT("", root, list);
        }
        return list;
    }

    public void searchBT(String path, TreeNode node, List<String> list){
        if (node.left == null && node.right == null)
            list.add(path + node.val);
        if (node.left != null){
            searchBT(path + node.val + "->", node.left, list);
        }
        if (node.right != null){
            searchBT(path + node.val + "->", node.right, list);
        }
    }
}
