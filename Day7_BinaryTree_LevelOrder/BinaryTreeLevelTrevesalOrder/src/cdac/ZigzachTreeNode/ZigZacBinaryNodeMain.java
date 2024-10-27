package cdac.ZigzachTreeNode;

import java.util.List;


public class ZigZacBinaryNodeMain {
	public static void main(String arg[])
	{
		BinaryTreeZigZacLevelOrder tree = new BinaryTreeZigZacLevelOrder();
		
		BNTree root = new BNTree(3);
		root.leftChild = new BNTree(56);
		root.rightChild = new BNTree(12);
		root.rightChild.leftChild = new BNTree(13);
		root.rightChild.rightChild = new BNTree(45);
		List<List<Integer>> listTrew =  tree.levelOrderZigZac(root);
		
		System.out.println(listTrew);
	}
}
