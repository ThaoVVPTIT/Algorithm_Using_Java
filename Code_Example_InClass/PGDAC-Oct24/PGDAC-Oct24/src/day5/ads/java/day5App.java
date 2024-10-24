package day5.ads.java;

public class day5App {

	public static void testSortedDList() {
		SortedDList list = new SortedDoublyList();
		
		list.insert(5);
		list.insert(1);
		list.insert(10);
		list.insert(3);
		
		list.print();
		list.printBackwards();
	}

	public static void testSortedCircularDList() {
		SortedDList list = new CircularDoublyList();
		
		list.insert(5);
		list.insert(1);
		list.insert(10);
		list.insert(3);
		
		list.print();
		list.printBackwards();
	}

	public static void testSListUsingNodePool() {
		SListUsingNodePool list = new SListUsingNodePool();
		
		list.addAtFront(1);
		list.addAtFront(10);
		list.addAtFront(20);
		
		list.print();
		
		System.out.println("Deleting - " + list.deleteFirstNode());
		
		list.print();
		
		list.addAtFront(100);
		
		list.print();
	}

	public static void main(String[] args) {
		testSortedDList();
		testSortedCircularDList();
		testSListUsingNodePool();
	}

}
