package day5.ads.java;

import day3.ads.java.List;
import day4.ads.java.SLNode;

public class SListUsingNodePool implements List {
	SLNode head;
	SLNode tail;
	NodePoolMgr nodePoolMgr;
	
	public SListUsingNodePool() {
		nodePoolMgr = new NodePoolMgr(100);
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		//SLNode newNode = new SLNode();
		SLNode newNode = nodePoolMgr.createNode();
		newNode.data = element;
		newNode.next = head;
		head = newNode;
		
		if (tail == null) {
			tail = head;
		}
	}

	@Override
	public void addAtRear(int element) {
	}

	@Override
	public int deleteFirstNode() {
		if (isEmpty()) {
			// TODO: Throw appropriate exception.
			return -1;
		}

		SLNode temp = head;
		
		head = head.next;
		if (isEmpty()) {
			tail = head;
		}

		int result = temp.data;
		nodePoolMgr.deleteNode(temp);
		return result;
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
		SLNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

}
