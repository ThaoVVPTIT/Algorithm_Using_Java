package cdac.ValidateBinarySearchTree;

public class ValidateBinarySearchTree {
	private boolean isValidBSTHelper(TreeNode node, Integer min, Integer max)
	{
		 if(node == null) return true;
		 if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
		        return false;
		    }

		    return isValidBSTHelper(node.leftChild, min, node.val) && 
		           isValidBSTHelper(node.rightChild, node.val, max);
	}
	 public boolean isValidBST(TreeNode root) {
		 boolean checking = isValidBSTHelper(root, null, null);
		 return checking;
	 }
}
