package cdac.doublyLinkList;

public class DBNodeTestingSorted {
	public static void main(String arg[])
	{
		DBNodeCreate list = new DBNodeCreate();
		list.insertNode(12);
		list.insertNode(34);
		list.insertNode(43);
		list.insertNode(34);
		list.insertNode(243);
		list.Display();
		
		list.deleteAll(34);
		list.deleteNode(243);
		list.Display();
	}
}
