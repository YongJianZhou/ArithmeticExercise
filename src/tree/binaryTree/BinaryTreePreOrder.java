package tree.binaryTree;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/9/25 15:52
 */
public class BinaryTreePreOrder {

    public static void PreOrder(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.val);
            PreOrder(treeNode.left);
            PreOrder(treeNode.right);
        } else {
            System.out.print("*");
        }
    }

    public static void InOrder(TreeNode treeNode) {
        if (treeNode != null) {
            InOrder(treeNode.left);
            System.out.print(treeNode.val);
            InOrder(treeNode.right);
        } else {
            System.out.print("*");
        }
    }

    public static void PostOrder(TreeNode treeNode){
        if (treeNode != null) {
            InOrder(treeNode.left);
            InOrder(treeNode.right);
            System.out.print(treeNode.val);
        } else {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.createRandomBinaryTree();
        PreOrder(treeNode);
        System.out.println();
        InOrder(treeNode);
        System.out.println();
        PostOrder(treeNode);
    }
}
