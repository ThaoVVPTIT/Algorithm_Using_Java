package cdac.searchBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchBinarySearchTree implements SearchBinaryFunction {

	public SearchBinarySearchTree() {

	}

	@Override
	public NodeTree searchBST(NodeTree root, int val) {
		if (root == null) {
			return null;
		}
		Queue<NodeTree> q = new LinkedList<NodeTree>();
		q.offer(root);
		while (!q.isEmpty()) {
			NodeTree currentNode = q.poll();
			if (currentNode.data == val) {
				return currentNode;
			}
			if (currentNode.leftChild != null) {
				q.offer(currentNode.leftChild);
			}
			if (currentNode.rightChild != null) {
				q.offer(currentNode.rightChild);
			}
		}
		return null;
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
