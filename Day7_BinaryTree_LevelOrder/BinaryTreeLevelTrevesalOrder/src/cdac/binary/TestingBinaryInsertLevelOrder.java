package cdac.binary;

public class TestingBinaryInsertLevelOrder {
	public static void main(String arg[])
	{
		System.out.println("Testing Binary Insert Level");
		BinaryTreeLevelOrder binaryTreeLevel = new BinaryTreeLevelOrder();
		binaryTreeLevel.insertNodeOfTree(123);
		binaryTreeLevel.insertNodeOfTree(356);
		binaryTreeLevel.printUsingPostOrder();
	}
}
