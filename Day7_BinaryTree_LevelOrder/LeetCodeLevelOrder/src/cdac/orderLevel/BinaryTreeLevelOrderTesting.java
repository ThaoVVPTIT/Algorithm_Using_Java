package cdac.orderLevel;

import java.util.List;

public class BinaryTreeLevelOrderTesting {
	public static void main(String arg[])
	{
		BinaryTreeLevelOrder levelOrders = new BinaryTreeLevelOrder();
		BNTree root = new BNTree(3);
		root.leftchild = new BNTree(56);
		root.rightchild = new BNTree(12);
		root.rightchild.leftchild = new BNTree(13);
		root.rightchild.rightchild = new BNTree(45);
		List<List<Integer>> output = levelOrders.levelOrder(root);
		System.out.println(output);
	}
}
