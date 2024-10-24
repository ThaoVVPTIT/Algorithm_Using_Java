package day3.ads.java;

import day2.ads.java.Stack;

public class StackUsingList implements Stack {
	private List list;
	
	public StackUsingList() {
		list = new SinglyList();
	}

	@Override
	public void push(int element) {
		list.addAtFront(element);
	}

	@Override
	public int pop() {
		return list.deleteFirstNode();
	}

	@Override
	public int peek() {
		int result = list.deleteFirstNode();
		list.addAtFront(result);

		return result;
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
