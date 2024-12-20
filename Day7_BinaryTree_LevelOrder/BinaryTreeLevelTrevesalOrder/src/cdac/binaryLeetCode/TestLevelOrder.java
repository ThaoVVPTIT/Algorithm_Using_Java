package cdac.binaryLeetCode;

import java.util.List;

public class TestLevelOrder {
	public static void main(String arg[])
	{
		BinaryTreeLevelTraverselOrder levelOrders = new BinaryTreeLevelTraverselOrder();
		BNTree root = new BNTree(3);
		root.leftChild = new BNTree(56);
		root.rightChild = new BNTree(12);
		root.rightChild.leftChild = new BNTree(13);
		root.rightChild.rightChild = new BNTree(45);

		List<List<Integer>> level = levelOrders.levelOrder(root);
		levelOrders.InsertInOrderUsingQueue(root, 123);
		System.out.println(level);
		
        List<List<Integer>> levelAfter = levelOrders.levelOrder(root);
        System.out.println("Level Order after insertion: " + levelAfter);
	}
}
