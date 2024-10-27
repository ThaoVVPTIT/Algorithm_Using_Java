package cdac.preOrder;

public class printUsingPreOrder {

	public static void main(String[] args) {
		BinaryTreeTraversalPreOrder tree = new BinaryTreeTraversalPreOrder();
		tree.CreateTree();
		tree.InsertTreeUseRecursion(124);
		tree.printUsingPreOrder();
		
		System.out.println("Print using preOrder User Stack");
		tree.printUsingPreOrderStack();
	}
}
