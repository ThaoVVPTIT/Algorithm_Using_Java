package cdac.deleteBNT;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDeleteNode {
	public TreeNode root;
	public BinaryTreeDeleteNode() {}
	public void insert(int val)
	{
		if(root == null)
		{
			root = new TreeNode(val);
			return;
		}
		TreeNode current = root;
		while(current != null)
		{
			if(val < current.data)
			{
				if(current.leftChild == null)
				{
					current.leftChild = new TreeNode(val);
					return;
				}
				else current = current.leftChild;
			}
			else
			{
				if(current.rightChild == null)
				{
					current.rightChild = new TreeNode(val);
					return;
				}
				else current = current.rightChild;
			}
		}
	}
	public void delete(int val)
	{
		TreeNode current = root;
		TreeNode parent  = null;
		while(current != null)
		{
			if(current.data == val)
			{
				break;
			}
			parent = current;
			if(val < current.data)
			{
				current = current.leftChild;
			}
			else current = current.rightChild;
		}
		if(current == null)
		{
			return;
		}
		/*Delete leaf node*/
		/*Delete leaf of Binary Tree*/
		if(current.leftChild == null && current.rightChild == null)
		{
			if(current.data == val)
			{
				current = null;
				return;
			}
			if(current == parent.leftChild)
			{
				parent.leftChild = null;
			}
			if(current == parent.rightChild)
			{
				parent.rightChild = null;
			}
		}
		/*Delete node have only one child*/
		TreeNode childOfOldParent = null;
		if(current.leftChild == null)
		{
			childOfOldParent = current.rightChild;
		}
		if(current.rightChild == null)
		{
			childOfOldParent = current.leftChild;
		}
		if(childOfOldParent != null)
		{
			if(current == parent.leftChild)
			{
				parent.leftChild = childOfOldParent;
			}
			if(current == parent.rightChild)
			{
				parent.rightChild = childOfOldParent;
			}
			return;
		}
		TreeNode inoderSuccessorParent = null;
		TreeNode inoderSuccessor = current.rightChild;
		while(inoderSuccessor.leftChild != null)
		{
			inoderSuccessorParent = inoderSuccessor;
			inoderSuccessor = inoderSuccessor.leftChild;
		}
		
		int t = current.data;
		current.data = inoderSuccessor.data;
		inoderSuccessor.data = t;
		if(inoderSuccessor == inoderSuccessorParent.leftChild)
		{
			inoderSuccessorParent.leftChild = inoderSuccessor.leftChild;
		}
		else
		{
			inoderSuccessorParent.rightChild = inoderSuccessor.rightChild;
		}
	}
	public void printUsingLevelOrder()
	{
		if(root == null)
		{
			return;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode currentNode = q.poll();
			System.out.print(currentNode.data + " ");
			if(currentNode.leftChild != null)
			{
				q.offer(currentNode.leftChild);
			}
			if(currentNode.rightChild != null)
			{
				q.offer(currentNode.rightChild);
			}
		}
	}
}
