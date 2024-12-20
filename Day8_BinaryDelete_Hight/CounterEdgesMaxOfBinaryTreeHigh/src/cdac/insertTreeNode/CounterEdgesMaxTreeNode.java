package cdac.insertTreeNode;

public class CounterEdgesMaxTreeNode implements FunctionTreeNode {
	public TreeNode roots;

	private void insert(TreeNode root, int element) {
		if (root == null) {
			roots = new TreeNode(element);
			return;
		}
		TreeNode CurrentNode = root;
		while (CurrentNode != null) {
			if (element < CurrentNode.data) {
				if (CurrentNode.leftChild != null) 
				{
					CurrentNode = CurrentNode.leftChild;
				} else 
				{
					CurrentNode.leftChild = new TreeNode(element);
					return;
				}
			} 
			else 
			{
				if (CurrentNode.rightChild != null) {
					CurrentNode = CurrentNode.rightChild;
				} else {
					CurrentNode.rightChild = new TreeNode(element);
					return;
				}
			}
		}
	}

	@Override
	public void insert(int element) {
		insert(roots, element);
	}

	private void delete(TreeNode root, int element) {
		/* Step 1: Finding node i want to delete */
		TreeNode current = root;
		TreeNode parent = null; /* Store parent of Node current */
		while (current != null) {
			if (current.data == element) {
				break;
			}
			parent = current;
			if (element < current.data) {
				current = current.leftChild;
			} else
				current = current.rightChild;
		}
		if (current == null) {
			return;
		}
		/* DElete leaf node */
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) {
				root = null;
				return;
			}
			if (current == parent.leftChild) {
				parent.leftChild = null;
			}
			if (current == parent.rightChild) {
				parent.rightChild = null;
			}
			return;
		}
		/* To track only child of current. */
		TreeNode childOldCurrent = null;
		if (current.leftChild == null) {
			childOldCurrent = current.rightChild;
		}
		if (current.rightChild == null) {
			childOldCurrent = current.leftChild;
		}
		if (childOldCurrent != null) {
			if (current == parent.leftChild) {
				parent.leftChild = childOldCurrent;
			}
			if (current == parent.rightChild) {
				parent.rightChild = childOldCurrent;
			}
			return;
		}
		/*
		 * current has two children !!! Find inorder successor of current
		 */
		TreeNode inoderSuccessorParent = null;
		TreeNode inoderSuccessor = current.rightChild;
		/* Find inorder successor of current. */
		while (inoderSuccessor.leftChild != null) {
			inoderSuccessorParent = inoderSuccessor;
			inoderSuccessor = inoderSuccessor.leftChild;
		}
		/* Swap values of inorderSuccessor and current node. */
		int t = current.data;
		current.data = inoderSuccessor.data;
		inoderSuccessor.data = t;
		// Delete inorderSuccessor node.
		if (inoderSuccessor == inoderSuccessorParent.leftChild) {
			inoderSuccessorParent.leftChild = inoderSuccessor.rightChild;
		} else {
			inoderSuccessorParent.rightChild = inoderSuccessor.rightChild;
		}
	}

	@Override
	public void delete(int element) {
		delete(roots, element);
	}
	
	private void printUsingInorder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		if (root.leftChild != null) {
			printUsingInorder(root.leftChild);
		}

		System.out.print(root.data + " ");

		if (root.rightChild != null) {
			printUsingInorder(root.rightChild);
		}
	}
	
	public void printUsingInorder() {
		printUsingInorder(roots);
		System.out.println("");
	}
}
