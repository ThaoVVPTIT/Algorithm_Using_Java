package day4.ads.java;

public class SortedSinglyList implements SortedList {
	SLNode head;
	
	public SortedSinglyList() {
		head = null;
	}

	@Override
	public void insert(int element) {
		SLNode newNode = new SLNode(element);
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		SLNode current = head;
		SLNode previous = null;
		while (current != null) {
			if (current.data > newNode.data) {
				break;
			}
			previous = current;
			current = current.next;
		}
		
		if (previous == null) { // or current == head
			newNode.next = head;
			head = newNode;
			return;
		}
		
		previous.next = newNode;
		newNode.next = current;
	}

	@Override
	public void delete(int element) {
		// TODO: Assignment
	}

	@Override
	public void deleteAll(int element) {
		// TODO: Assignment
	}

	@Override
	public boolean search(int element) {
		// TODO: Assignment
		return false;
	}

	@Override
	public void print() {
		SLNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

}
