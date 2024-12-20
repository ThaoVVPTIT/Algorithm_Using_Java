package cdac.preOrder;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeTraversalPreOrder implements BNTreeFunction{
	public BNTree root;
	public BinaryTreeTraversalPreOrder() {}
	@Override
	public void CreateTree() {
		BNTree n1 = new BNTree(1);
		BNTree n2 = new BNTree(3);
		BNTree n3 = new BNTree(4);
		BNTree n4 = new BNTree(78);
		
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.leftChild = n4;
		n2.rightChild = null;
		
		n3.leftChild = null;
		n3.rightChild = null;
		
		n4.leftChild = null;
		n4.rightChild = null;
		
		root = n1;
		
	}
	
	private BNTree InsertTreeUseRecursion(BNTree root, int val)
	{
		if(root == null)
		{
			root = new BNTree(val);
			return root;
		}
		if(root.data == val)
		{
			return root;
		}
		if(val < root.data)
		{
			root.leftChild = InsertTreeUseRecursion(root.leftChild, val);
		}
		else root.rightChild =  InsertTreeUseRecursion(root.rightChild, val);
		
		return root;
	}
	
	@Override
	public void InsertTreeUseRecursion(int element) {
		InsertTreeUseRecursion(root, element);
	}
	private void printUsingPreOrder(BNTree root)
	{
		if(root == null) return;
		System.out.print(root.data + " ");
		if(root.leftChild != null)
		{
			printUsingPreOrder(root.leftChild);
		}
		if(root.rightChild != null)
		{
			printUsingPreOrder(root.rightChild);
		}
	}
	@Override
	public void printUsingPreOrder() {
		printUsingPreOrder(root);
		System.out.println();
	}
	
	private ArrayList<Integer> printUsingPreOrderStack(BNTree root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Stack<BNTree> s = new Stack<BNTree>();
		s.push(root);
		while(!s.empty())
		{
			BNTree tmp = s.pop();
			res.add(tmp.data);
			if(tmp.rightChild != null)
			{
				s.push(tmp.rightChild);
			}
			if(tmp.leftChild != null)
			{
				s.push(tmp.leftChild);
			}
		}
		return res;
	}
	@Override
	public void printUsingPreOrderStack() {
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = printUsingPreOrderStack(root);
		System.out.println(res);
	}
}
