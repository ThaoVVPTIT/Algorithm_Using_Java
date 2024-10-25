package cdac.TreeBinary;

public interface BNTreeFunctional {
	public void TreeCreate();
	public void printUsingInOrder();
	public void printUsingPostOrder();
	public int CounterNodeOfTree();
	public int CounterLeafOfTree();
	public int CounterNodeEqualValue(int value);
	public void InsertNodeInsideTree(int value);
}
