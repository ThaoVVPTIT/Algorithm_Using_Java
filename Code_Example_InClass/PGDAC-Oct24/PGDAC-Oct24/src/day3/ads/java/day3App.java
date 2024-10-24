package day3.ads.java;

import java.util.Arrays;

import day2.ads.java.Stack;

public class day3App {
	public static void reverseArrayUsingStack(int[] arr, Stack s) {
		for (int i = 0; i < arr.length; ++i) {
			s.push(arr[i]);
		}

		int i = 0;
		while (!s.isEmpty()) {
			arr[i] = s.pop();
			++i;
		}
	}

	public static void testList() {
		List list = new SinglyList();
		
		list.addAtFront(5);
		list.addAtFront(10);
		list.addAtRear(100);
		list.addAtRear(20);
		
		list.print();
		
		System.out.println("Element removed is = " + list.deleteFirstNode());
		
		list.print();
	}

	public static void testReverse() {
		int[] nums = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Before reversing - " + Arrays.toString(nums));
		
		Stack s = new StackUsingList();
		reverseArrayUsingStack(nums, s);

		System.out.println("After reversing - " + Arrays.toString(nums));
	}

	public static void main(String[] args) {
		testList();
		testReverse();
	}

}
