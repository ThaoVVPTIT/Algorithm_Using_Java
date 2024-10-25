package cdac.binarytree;


public class PostOrderPrintln implements BinaryTreeFunction{
	BNTree rootsPostOrder;

	@Override
	public void Creatree() {
		BNTree n1 = new BNTree();
		BNTree n2 = new BNTree();
		BNTree n3 = new BNTree();
		BNTree n4 = new BNTree();
		
		n1.data = 5;
		n1.leftchild = n2;
		n1.rightchild = n3;
		
		n2.data = 10;
		n2.leftchild = n4;
		n2.rightchild = null;
		
		n3.data = 6;
		n3.leftchild = null;
		n3.rightchild = null;
		
		n4.data = 8;
		n4.leftchild = null;
		n4.rightchild = null;
		rootsPostOrder = n1;
	}
	private void printUsingPostOrder(BNTree roots)
	{
		if(roots ==null)
		{
			return;
		}
		if(roots.leftchild != null)
		{
			printUsingPostOrder(roots.leftchild);
		}
		if(roots.rightchild != null)
		{
			printUsingPostOrder(roots.rightchild);
		}
		System.out.print(roots.data + " ");
	}
	
	public void printUsingPostOrder()
	{
		printUsingPostOrder(rootsPostOrder);
		System.out.println();
	}
	
	private void printUsingInorder(BNTree roots)
	{
		if(roots == null) return;
		if(roots.leftchild != null)
		{
			printUsingInorder(roots.leftchild);
		}
		System.out.print(roots.data + " ");
		if(roots.rightchild != null)
		{
			printUsingInorder(roots.rightchild);
		}
	}
	
	private static int counterNode(BNTree roots)
	{
		if(roots == null)
		{
			return 0;
		}
		return 1 + counterNode(roots.leftchild) + counterNode(roots.rightchild);
	}
	
	public int counterNode()
	{
		int counter = counterNode(rootsPostOrder);
		return counter;
	}
	@Override
	public void printUsingInorder() {
		printUsingInorder(rootsPostOrder);
		System.out.println();
	}
	
}
