package tree.binaryTree;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * Given a Binary Search Tree (BST),
 * convert it to a Greater Tree such that every key of the original BST is
 * changed to the original key plus sum of all keys greater than the original key in BST.
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-bst-to-greater-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/9/21 21:21
 */
public class ConvertBSTtoGreaterTree {
    int sum;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        sum += root.val;
        root.val =sum;
        convertBST(root.left);
        return root;
    }
}
