package cdac.ValidateBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        ValidateBinarySearchTree bstChecker = new ValidateBinarySearchTree();

        TreeNode root = new TreeNode(10);
        root.leftChild = new TreeNode(5);
        root.rightChild = new TreeNode(15);
        root.rightChild.leftChild = new TreeNode(12);
        root.rightChild.rightChild = new TreeNode(20);

        boolean result = bstChecker.isValidBST(root);
        System.out.println(result);
    }
}