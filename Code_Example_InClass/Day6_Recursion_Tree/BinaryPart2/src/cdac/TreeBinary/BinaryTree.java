package cdac.TreeBinary;

public class BinaryTree implements BNTreeFunctional{
	public BNTree roots;
	public BinaryTree()
	{
		
	}
	@Override
	public void TreeCreate() {
		 BNTree n1 = new BNTree();
		 BNTree n2 = new BNTree();
		 BNTree n3 = new BNTree();
		 BNTree n4 = new BNTree();
		 
		 n1.data = 5;
		 n1.leftChild = n2;
		 n1.rightChild = n3;
		 
		 n2.data = 10;
		 n2.leftChild = n4;
		 n2.rightChild = null;
		 
		 n3.data = 6;
		 n3.leftChild = null;
		 n3.rightChild = null;
		 
		 n4.data = 8;
		 n4.leftChild = null;
		 n4.rightChild = null;
		 roots = n1;
	}
	
	private void prinUsingInOrder(BNTree root)
	{
		if(root == null)
		{
			return;
		}
		if(root.leftChild != null)
		{
			prinUsingInOrder(root.leftChild);
		}
		System.out.print(root.data + " ");
		if(root.rightChild != null)
		{
			prinUsingInOrder(root.rightChild);
		}
	}
	
	@Override
	public void printUsingInOrder() {
		prinUsingInOrder(roots);
		System.out.println();
		
	}
	
	private void printUsingPostOrder(BNTree root)
	{
		if(root == null)
		{
			return;
		}
		if(root.leftChild != null)
		{
			printUsingPostOrder(root.leftChild);
		}
		if(root.rightChild != null)
		{
			printUsingPostOrder(root.rightChild);
		}
		System.out.print(root.data + " ");
	}
	
	@Override
	public void printUsingPostOrder() {
		printUsingPostOrder(roots);
		System.out.println();
	}
	private int counter(BNTree root)
	{
		if(root == null) return 0;
		return 1 + counter(root.leftChild) + counter(root.rightChild);
	}
	@Override
	public int CounterNodeOfTree() {
		int countNode = counter(roots);
		return countNode;
	}
	private int counterLeafOfTree(BNTree root)
	{
		if(root == null) return 0;
		if(root.leftChild == null && root.rightChild == null)
		{
			return 1;
		}
		return counterLeafOfTree(root.leftChild) + counterLeafOfTree(root.rightChild);
	}
	@Override
	public int CounterLeafOfTree() {
		int counterLeaf = counterLeafOfTree(roots);
		return counterLeaf;
	}
	private int CounterNodeEqualValue(BNTree root, int val)
	{
		if(root == null) return 0;
		int count = 0;
		if(root.data == val)
		{
			count++;
		}
		count += CounterNodeEqualValue(root.leftChild, val);
		count += CounterNodeEqualValue(root.rightChild, val);
		return count;
	}
	@Override
	public int CounterNodeEqualValue(int value) {
		return CounterNodeEqualValue(roots, value);
	}
	private void InsertNodeInsideTree(BNTree root, int val)
	{
		if(root == null) return;
		if(val < root.data)
		{
			if(root.leftChild == null)
			{
				root.leftChild = new BNTree(val);
			}
			else InsertNodeInsideTree(root.leftChild, val);
		}
		else
		{
			if(root.rightChild == null)
			{
				root.rightChild = new BNTree(val);
			}
			else InsertNodeInsideTree(root.rightChild, val);
		}
	}
	@Override
	public void InsertNodeInsideTree(int value) {
		InsertNodeInsideTree(roots, value);
	}
}
