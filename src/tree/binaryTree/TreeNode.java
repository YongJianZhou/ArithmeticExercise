package tree.binaryTree;

import java.util.Random;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/9/14 18:12
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode createRandomBinaryTree() {
        TreeNode root = new TreeNode(new Random().nextInt(10));
        int nodeDeep = new Random().nextInt(10);
        createRandomBinaryTreeNode(root, nodeDeep);
        return root;
    }

    private static void createRandomBinaryTreeNode(TreeNode node, int deep) {
        if (deep <= 0 || node == null) {
            return;
        }
        if (new Random().nextInt(10) > 2) {
            node.left = new TreeNode(new Random().nextInt(10));
        }
        if (new Random().nextInt(10) > 2) {
            node.right = new TreeNode(new Random().nextInt(10));
        }
        createRandomBinaryTreeNode(node.left, --deep);
        createRandomBinaryTreeNode(node.right, deep);
    }
}
