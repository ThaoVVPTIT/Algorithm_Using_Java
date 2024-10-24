package day2.ads.java;

import java.util.Arrays;

public class day2App {
	public static void reverseArrayUsingStack(int[] arr, Stack s) {
		for (int i = 0; i < arr.length; ++i) {
			s.push(arr[i]);
		}

		/*
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = s.pop();
		}
		*/
		int i = 0;
		while (!s.isEmpty()) {
			arr[i] = s.pop();
			++i;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Before reversing - " + Arrays.toString(nums));
		
		Stack s = new FixedSizeStack(10);
		reverseArrayUsingStack(nums, s);

		System.out.println("After reversing - " + Arrays.toString(nums));
	}

}
