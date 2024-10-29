package cdac.deleteBNT;

public class TestingDeleteNodeOfBNRT {
	public static void main(String arg[])
	{
		BinaryTreeDeleteNode root = new BinaryTreeDeleteNode();
		root.insert(1000);
		root.insert(100);
		root.insert(10);
		root.insert(1);
		System.out.println("Binary Tree Before Delete");
		root.printUsingLevelOrder();
		System.out.println();
		root.delete(10);
		System.out.println("Binary Tree After Delete");
		root.printUsingLevelOrder();
	}
}
