package cdac.ZigzachTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeZigZacLevelOrder implements BNTreeZigZac{
	public BNTree root;
	public BinaryTreeZigZacLevelOrder()
	{
		
	}
	@Override
	public List<List<Integer>> levelOrderZigZac(BNTree root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null)
		{
			return result;
		}
		Queue<BNTree> q = new LinkedList<BNTree>();
		q.offer(root);
		boolean leftRight = true;
		while(!q.isEmpty())
		{
			int sizeLevel = q.size();
			List<Integer> TreeNodeTheSameLevel = new ArrayList<Integer>();
			for(int i = 0; i < sizeLevel; i++)
			{
				BNTree currentNode = q.poll();
				if(leftRight)
				{
					/*Add in tail list: Left -> Right*/
					TreeNodeTheSameLevel.add(currentNode.data);
				}
				else
				{
					/*add in head list : Right -> Left*/
					TreeNodeTheSameLevel.add(0, currentNode.data);
				}
				if(currentNode.leftChild != null)
				{
					q.offer(currentNode.leftChild);
				}
				if(currentNode.rightChild != null)
				{
					q.offer(currentNode.rightChild);
				}
			}
			result.add(TreeNodeTheSameLevel);
			leftRight = !leftRight; 
		}
		return result;
	}
}
