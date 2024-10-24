package cdac.doublyLinkList;

public interface DBFunctionList {
	public void insertNode(int element);
	public void deleteNode(int element);
	public void deleteAll(int element);
	boolean search(int element);
	public void Display();
	public void DisplayBackYard();
	public boolean isEmpy();
}
