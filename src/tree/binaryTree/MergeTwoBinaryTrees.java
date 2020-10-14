package tree.binaryTree;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/9/23 10:35
 * <p>
 * Given two binary trees and imagine that when you put one of them to cover the other,
 * some nodes of the two trees are overlapped while the others are not.
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node. Otherwise,
 * the NOT null node will be used as the node of new tree.
 * <p>
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，
 * 那么将他们的值相加作为节点合并后的新值，否则不为NULL 的节点将直接作为新二叉树的节点。
 *
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeTwoBinaryTrees {

    /**
     * 自己
     *
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 != null) {
            t1.val += t2 == null ? 0 : t2.val;
            if (t1.left == null) {
                if (t2 != null) {
                    t1.left = t2.left;
                    t2.left = null;
                }
            }
            if (t1.right == null) {
                if (t2 != null) {
                    t1.right = t2.right;
                    t2.right = null;
                }
            }
            mergeTrees(t1.left, t2 == null ? null : t2.left);
            mergeTrees(t1.right, t2 == null ? null : t2.right);
        } else {
            t1 = t2;
        }
        return t1;
    }
}
