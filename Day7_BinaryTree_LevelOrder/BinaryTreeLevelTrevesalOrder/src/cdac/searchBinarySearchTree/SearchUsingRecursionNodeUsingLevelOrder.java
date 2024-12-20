package cdac.searchBinarySearchTree;

public class SearchUsingRecursionNodeUsingLevelOrder implements SearchBinaryFunction{
	public SearchUsingRecursionNodeUsingLevelOrder() {}
	@Override
	public NodeTree searchBST(NodeTree root, int val) {
		if(root == null) return null;
		
		NodeTree currentNode = root;
		if(currentNode.data == val)
		{
			return currentNode;
		}
		if(val < currentNode.data)
		{
			return searchBST(root.leftChild, val);
		}
		return searchBST(root.rightChild, val);
	}
	@Override
	public void printPreOrder(NodeTree node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		printPreOrder(node.leftChild);
		printPreOrder(node.rightChild);
	}

}
