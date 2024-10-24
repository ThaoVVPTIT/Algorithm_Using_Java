package cdac.doublelinklist;

public class TestDBNode {
	public static void main(String arg[])
	{
		System.out.println("Test Double Linked List");
		DBNodeCreate doublyNode = new DBNodeCreate();
		doublyNode.addAtFront(12);
		doublyNode.addAtFront(15);
		doublyNode.addAtRear(43);
		doublyNode.addAtFront(1323);
		doublyNode.print();
		
		doublyNode.printBackwards();
		
		doublyNode.deleteFirstNode();
		doublyNode.print();
	}
}
