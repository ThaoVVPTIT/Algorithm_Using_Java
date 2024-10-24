package day3.ads.java;

public class SinglyList implements List {
	class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;

	public SinglyList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = head;
		head = newNode;
		
		if (tail == null) {
			tail = head;
		}
	}

	@Override
	public void addAtRear(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		
		// TODO: call isEmpty()
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if (isEmpty()) {
			// TODO: Throw appropriate exception.
			return -1;
		}

		Node temp = head;
		
		head = head.next;
		if (isEmpty()) {
			tail = head;
		}

		return temp.data;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		Node current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}
}
