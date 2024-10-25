package cdac.binaryTree;

public interface BNTreeFunction {
	public void createBinaryTree();
	public void printUsingInOrder();
	public void printUsingPostOrder();
	public int counterNumberOfNode();
	public int counterLeafOfNode();
	public int counterDataOfNode(int val);
	public void insertNodeOfTree(int val);
}
