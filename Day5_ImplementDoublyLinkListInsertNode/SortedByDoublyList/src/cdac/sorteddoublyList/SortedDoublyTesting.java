package cdac.sorteddoublyList;

public class SortedDoublyTesting {
	
	public static void main(String arg[])
	{
		SortedDoublyList list = new SortedDoublyList();
		
		list.insertNode(100);
		list.insertNode(19);
		list.insertNode(30);
		list.insertNode(1);
		list.insertNode(19);
	
		
		list.Display();
		
		/*deleteALL call*/
		list.deleteAll(19);
		list.Display();
	}
}