package cdac.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrder implements BNTreeFunction{
	BNTree root;
	public BinaryTreeLevelOrder()
	{
		this.root = null;
	}
	private BNTree insertNodeOfTree(BNTree root, int ele)
	{
		if(root == null) {
			return new BNTree(ele);
		}
		if(root.data == ele)
		{
			return root;
		}
		if(root.data > ele)
		{
			if(root.leftChild == null)
			{
				root.leftChild = new BNTree(ele);
			}
			else 
			{
				insertNodeOfTree(root.leftChild, ele);
			}
		}
		else
		{
			if(root.rightChild == null)
			{
				root.rightChild = new BNTree(ele);
			}
			insertNodeOfTree(root.rightChild, ele);
		}
		return root;
	}
	@Override
	public void insertNodeOfTree(int element) {
		root = insertNodeOfTree(root, element);
	}
	private void printUsingPreOrder(BNTree root)
	{
		if(root == null) return;
		System.out.print(root.data + " ");
		printUsingPreOrder(root.leftChild);
		printUsingPreOrder(root.rightChild);
	}
	@Override
	public void printUsingPreOrder() {
		printUsingPreOrder(root);
		System.out.println();
	}
	private void printUsingPostOrder(BNTree root)
	{
		if(root == null) return;
		printUsingPostOrder(root.leftChild);
		printUsingPostOrder(root.rightChild);
		System.out.print(root.data + " ");
	}
	@Override
	public void printUsingPostOrder() {
		printUsingPostOrder(root);
		System.out.println();
	}
	
	private void printUsingInOrder(BNTree root)
	{
		if(root == null) return;
		printUsingInOrder(root.leftChild);
		System.out.print(root.data + " ");
		printUsingInOrder(root.rightChild);
	}
	
	@Override
	public void printUsingInOrder() {
		printUsingInOrder(root);
		System.out.println();
	}
	
	private BNTree insertLevelOrder(BNTree root, int val)
	{
		Queue<BNTree> q = new LinkedList<BNTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BNTree tmp = q.poll();
			if(tmp != null)
			{
				if(tmp.leftChild != null)
				{
					q.offer(tmp.leftChild);
				}
				else
				{
					tmp.leftChild = new BNTree(val);
					return root;
				}
				if(tmp.rightChild != null)
				{
					q.offer(tmp.rightChild);
				}
				else
				{
					tmp.rightChild = new BNTree(val);
					return root;
				}
			}
		}
		return root;
	}
	@Override
	public void insertLevelOrder(int element) {
		if (root == null) {
	        root = new BNTree(element);
	    } else {
	        insertLevelOrder(root, element);
	    }
	}
}
