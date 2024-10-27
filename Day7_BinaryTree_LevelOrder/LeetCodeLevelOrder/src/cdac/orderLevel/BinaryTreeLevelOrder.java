package cdac.orderLevel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {
	BNTree roots;
	
	public BinaryTreeLevelOrder() {}
	
	public List<List<Integer>> levelOrder(BNTree root)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null)
		{
			return result;
		}
		Queue<BNTree> q = new LinkedList<BNTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			/*Calculate Number Node the same level*/
			int levelSize = q.size();
			List<Integer> ListNodeSameLevel = new ArrayList<Integer>();
			for(int i = 0; i < levelSize; i++)
			{
				BNTree currentNode = q.poll();
				ListNodeSameLevel.add(currentNode.data);
				
				if(currentNode.leftchild != null)
				{
					q.offer(currentNode.leftchild);
				}
				if(currentNode.rightchild != null)
				{
					q.offer(currentNode.rightchild);
				}
			}
			result.add(ListNodeSameLevel);
		}
		return result;
	}
}