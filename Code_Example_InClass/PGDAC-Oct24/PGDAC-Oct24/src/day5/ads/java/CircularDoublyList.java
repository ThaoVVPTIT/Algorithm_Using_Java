package day5.ads.java;

import day4.ads.java.DLNode;

public class CircularDoublyList implements SortedDList {
	DLNode head;

	public CircularDoublyList() {
		head = new DLNode(0);
		head.next = head;
		head.previous = head;
	}

	@Override
	public void insert(int element) {
		// 1.
		DLNode newNode = new DLNode(element);
		
		// 3.
		DLNode current = head.next;
		while (current != head) {
			if (current.data > element) {
				break;
			}
			current = current.next;
		}
		
		// 6.
		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		current.previous = newNode;
	}

	@Override
	public void delete(int element) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll(int element) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean search(int element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		DLNode current = head.next;
		
		while (current != head) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

	@Override
	public void printBackwards() {
		DLNode current = head.previous;
		
		while (current != head) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println("");
	}

}
