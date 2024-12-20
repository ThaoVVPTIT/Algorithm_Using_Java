package cdac.binaryTree;

public class BinaryTree implements BNTreeFunction{
	BNTree root;
	public BinaryTree()
	{
		
	}
	@Override
	public void createBinaryTree() {
		BNTree n1 = new BNTree();
		BNTree n2 = new BNTree();
		BNTree n3 = new BNTree();
		BNTree n4 = new BNTree();
		
		n1.data = 10;
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.data = 5;
		n2.leftChild = n4;
		n2.rightChild = null;
		
		n3.data = 8;
		n3.leftChild = null;
		n3.rightChild = null;
		
		n4.data = 6;
		n4.leftChild = null;
		n4.rightChild = null;
		
		root = n1;
		
	}
	@Override
	public void printUsingInOrder() {
		printUsingInOrder(root);
		System.out.print("null");
		System.out.println();
	}
	private void printUsingInOrder(BNTree root) {
		if(root == null) return;
		
		if(root.leftChild != null)
		{
			printUsingInOrder(root.leftChild);
		}
		System.out.print(root.data + "->");
		if(root.rightChild != null)
		{
			printUsingInOrder(root.rightChild);
		}
	}
	private void printUsingPostOrder(BNTree root)
	{
		if(root == null) return;
		
		if(root.leftChild != null)
		{
			printUsingPostOrder(root.leftChild);
		}

		if(root.rightChild != null)
		{
			printUsingPostOrder(root.rightChild);
		}
		System.out.print(root.data + "->");
	}
	@Override
	public void printUsingPostOrder() {
		printUsingPostOrder(root);
		System.out.print("null");
		System.out.println();
	}
	
	private int counterNumberOfNode(BNTree root)
	{
		if(root == null) return 0;
		return 1 + counterNumberOfNode(root.leftChild) + counterNumberOfNode(root.rightChild);
	}
	@Override
	public int counterNumberOfNode() {
		int countNode = counterNumberOfNode(root);
		return countNode;
	}
	private int counterLeafOfNode(BNTree root)
	{
		if(root == null) return 0;
		if(root.leftChild == null && root.rightChild == null)
		{
			return 1;
		}
		return counterLeafOfNode(root.leftChild) + counterLeafOfNode(root.rightChild);
	}
	@Override
	public int counterLeafOfNode() {
		int counter = counterLeafOfNode(root);
		return counter;
	}
	private int counterDataOfNode(BNTree root, int val)
	{
		if(root == null) return 0;
		int counter = 0;
		if(root.data == val)
		{
			counter++;
		}
		counter += counterDataOfNode(root.leftChild, val);
		counter += counterDataOfNode(root.rightChild, val);
		return counter;
	}
	@Override
	public int counterDataOfNode(int val) {
		int counter = counterDataOfNode(root, val);
		return counter;
	}
	private void insertNodeOfTree(BNTree root, int val)
	{
		if(root == null) return;
		if(val < root.data)
		{
			if(root.leftChild == null)
			{
				root.leftChild = new BNTree(val);
			}
			else insertNodeOfTree(root.leftChild, val);
		}
		else 
		{
			if(root.rightChild == null)
			{
				root.rightChild = new BNTree(val);
			}
			else insertNodeOfTree(root.rightChild, val);
		}
	}
	@Override
	public void insertNodeOfTree(int val) {
		insertNodeOfTree(root, val);
	}
	
}
