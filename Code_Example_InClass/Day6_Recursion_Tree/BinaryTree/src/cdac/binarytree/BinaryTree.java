package cdac.binarytree;

public class BinaryTree implements BinaryTreeFunction{
	BNTree roots;
	public BinaryTree()
	{
		this.roots = null;
	}
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
		
		roots = n1;
	}
	private void printUsingInorders(BNTree root) {
		if(root == null)
		{
			return;
		}
		if(root.leftchild != null)
		{
			printUsingInorders(root.leftchild);
		}
		System.out.print(root.data + " ");
		if(root.rightchild != null)
		{
			printUsingInorders(root.rightchild);
		}
	}
	@Override
	public void printUsingInorder() {
		printUsingInorders(roots);
		System.out.println("");
	}
	
}
