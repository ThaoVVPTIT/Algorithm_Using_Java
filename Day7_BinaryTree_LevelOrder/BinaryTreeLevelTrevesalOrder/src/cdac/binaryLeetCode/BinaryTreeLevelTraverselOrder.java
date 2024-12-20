package cdac.binaryLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelTraverselOrder implements BNTreeFunctional{
	public BNTree root;
	public BinaryTreeLevelTraverselOrder() {}
	
	@Override
	public List<List<Integer>> levelOrder(BNTree root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null)
		{
			return result;
		}
		Queue<BNTree> q = new LinkedList<BNTree>();
		q.offer(root);
		
		while(!q.isEmpty())
		{
			/*Size of Node the same level*/
			int levelSize = q.size();
			List<Integer> treeNodeTheSameLevel = new ArrayList<Integer>();
			for(int i = 0; i < levelSize; i++)
			{
				BNTree currentNode = q.poll();
				treeNodeTheSameLevel.add(currentNode.data);
				if(currentNode.leftChild != null)
				{
					q.offer(currentNode.leftChild);
				}
				if(currentNode.rightChild != null)
				{
					q.offer(currentNode.rightChild);
				}
			}
			result.add(treeNodeTheSameLevel);
		}
		return result;
	}

	@Override
	public void InsertInOrderUsingQueue(BNTree root, int element) {
		if(root == null)
		{
			root = new BNTree(element);
			return;
		}
		Queue<BNTree> q = new LinkedList<BNTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BNTree tmp = q.poll();
			if(tmp != null)
			{
				if(tmp.leftChild == null)
				{
					tmp.leftChild = new BNTree(element);
					return;
				}
				else
				{
					q.offer(tmp.leftChild);
				}
				if(tmp.rightChild == null)
				{
					tmp.leftChild = new BNTree(element);
					return;
				}
				else q.offer(tmp.rightChild);
			}
			q.add(tmp);
		}
	}
}
