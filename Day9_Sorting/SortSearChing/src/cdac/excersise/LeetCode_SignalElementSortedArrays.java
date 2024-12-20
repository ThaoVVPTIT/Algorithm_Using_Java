package cdac.excersise;

import java.util.Scanner;

public class LeetCode_SignalElementSortedArrays {
	public static int singleNonDuplicate(int []arr, int n)
	{
		int result = 0;
		for(int i = 0; i < n; i++)
		{
			/*Using XOR*/
			result ^= arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Checking Sigle Element Duplicate ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Arrays = ");
		int n = scan.nextInt();
		int []arr = new int[100];
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Enter Arrays[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		int t = singleNonDuplicate(arr, n);
		System.out.println("Non Duplicate in Arrays sorted is = " + t);
		scan.close();
	}

}
