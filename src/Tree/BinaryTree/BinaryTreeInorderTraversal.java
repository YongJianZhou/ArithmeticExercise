package Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * 给定一个二叉树，返回它的中序遍历。
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/9/14 11:10
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursion(result, root);
        return result;
    }

    private static void recursion(List<Integer> result, TreeNode root) {
        if (root == null) return;
        recursion(result, root.left);
        result.add(root.val);
        recursion(result, root.right);
    }
}


