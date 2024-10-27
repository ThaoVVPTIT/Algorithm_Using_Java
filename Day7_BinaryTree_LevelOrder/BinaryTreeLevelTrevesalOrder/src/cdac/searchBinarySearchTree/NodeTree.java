package cdac.searchBinarySearchTree;

public class NodeTree {
	int data;
	NodeTree leftChild;
	NodeTree rightChild;
	public NodeTree() {}
	public NodeTree(int val) {
		this.data = val;
	}
	@Override
	public String toString() {
		return "NodeTree [data=" + data + "]";
	}
}
