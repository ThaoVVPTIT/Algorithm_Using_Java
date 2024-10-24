package day4.ads.java;

public class day4App {

	public static void testInsert() {
		SortedList list = new SortedSinglyList();
		
		list.insert(5);
		list.insert(10);
		list.insert(1);
		list.insert(20);
		list.insert(15);
		
		list.print();
	}

	public static void testDListAddAtFront() {
		DList list = new DoublyList();
		
		list.addAtFront(5);
		list.addAtFront(10);
		
		list.print();
		list.printBackwards();
	}

	public static void main(String[] args) {
		testInsert();
		testDListAddAtFront();
	}

}
