package cdac.insertTreeNode;

public class TesterTreeNode {

	public static void main(String[] args) {
	CounterEdgesMaxTreeNode bst01 = new CounterEdgesMaxTreeNode();
		
		bst01.insert(10);
		bst01.insert(5);
		bst01.insert(8);
		bst01.insert(20);
		bst01.insert(15);
		bst01.insert(30);
		bst01.insert(1);
		bst01.insert(12);
		
		//bst01.printUsingLevelorder();
		
		bst01.printUsingInorder();
		
		bst01.delete(1); // leaf node.
		bst01.delete(5); // node with one child.
		bst01.delete(10); // node with two childrens.

		bst01.printUsingInorder();
	}

}
