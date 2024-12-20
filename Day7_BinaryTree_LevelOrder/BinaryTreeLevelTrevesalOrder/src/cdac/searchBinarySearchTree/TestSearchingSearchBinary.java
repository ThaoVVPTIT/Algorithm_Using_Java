package cdac.searchBinarySearchTree;

public class TestSearchingSearchBinary {
	public static void main(String arg[])
	{
		System.out.println("Testing Searching Binary");
		SearchBinarySearchTree tree = new SearchBinarySearchTree();
		NodeTree root = new NodeTree(12);
		root.leftChild = new NodeTree(32);
		root.rightChild = new NodeTree(23);
		root.rightChild.leftChild = new NodeTree(34);
		root.rightChild.rightChild = new NodeTree(33);
		root.rightChild.rightChild.leftChild = new NodeTree(37);
		root.rightChild.rightChild.rightChild = new NodeTree(39);
		NodeTree treesfind = tree.searchBST(root, 33);
		tree.printPreOrder(treesfind);
		System.out.println();
		System.out.println("Method 2");
		SearchUsingRecursionNodeUsingLevelOrder tree1 = new SearchUsingRecursionNodeUsingLevelOrder();
		NodeTree treesfind1 = tree1.searchBST(root, 33);
		tree1.printPreOrder(treesfind1);
	}
}
