package cdac.sorteddoublyList;

public interface DBList {
	public void insertNode(int element);
	public void deleteNode(int element);
	public void deleteAll(int element);
	boolean search(int element);
	public void Display();
	public void DisplayBackYard();
	public boolean isEmpy();
}
