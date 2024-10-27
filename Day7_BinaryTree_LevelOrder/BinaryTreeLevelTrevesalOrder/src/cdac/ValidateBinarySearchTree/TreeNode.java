package cdac.ValidateBinarySearchTree;

public class TreeNode {
	int val;
	TreeNode leftChild;
	TreeNode rightChild;
	public TreeNode() {}
	public TreeNode(int val)
	{
		this.val = val;
	}
	@Override
	public String toString() {
		return "TreeNode [data=" + val + "]";
	}
	
}
