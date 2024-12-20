package cdac.sortingLinear;

import java.util.Scanner;

public class QickSorted2 {
	public static void QickSorted(int []arr, int left, int right)
	{
		if(left < right)
		{
			int p = partion(arr, left, right);
			QickSorted(arr, left, p - 1);
			QickSorted(arr, p + 1,  right);
		}
	}
	public static int partion(int []arr, int left, int right)
	{
		int pivot = arr[right];
		int i = left - 1;
		for(int j = left; j < right; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i]   = arr[j];
				arr[j]   = temp;
			}
		}
		/*Dua cai divot dung vao vi tri cua no*/
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
		return i+1;
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Testing Sorting Find Using Binary Search");
		System.out.println();
		System.out.println("Enter Number of TestCase t =");
		int t = scan.nextInt();
		int []arr = new int[100];
		while(t > 0)
		{
			System.out.println("Enter Size of Arrays n = ");
			int n = scan.nextInt();
			for(int i = 0; i < n; i++)
			{
				System.out.printf("Enter Arrays[%d] = ", i);
				arr[i] = scan.nextInt();
			}
			System.out.println("Arrays before Sorting using Bubble Sort is");
			System.out.print("[");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]);
				if(i < n - 1) System.out.print(", ");
			}
			System.out.println("]");
			
			
			System.out.println("Arrays AFTER Sorting using Bubble Sorted is");
			QickSorted(arr, 0, n - 1);
			System.out.print("[");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]);
				if(i < n - 1) System.out.print(", ");
			}
			System.out.println("]");
		}
		scan.close();
	}

}
