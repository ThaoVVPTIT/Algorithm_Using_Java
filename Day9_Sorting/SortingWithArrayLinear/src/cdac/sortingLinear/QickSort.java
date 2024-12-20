package cdac.sortingLinear;

import java.util.Scanner;

public class QickSort {
	public static void QickSorted(int []arr, int low, int high)
	{
		if(low < high)
		{
			int pivotIndex = qickSortedPartion(arr, low, high);
			QickSorted(arr, low, pivotIndex - 1);
			QickSorted(arr, pivotIndex + 1, high);
		}
	}
	public static int qickSortedPartion(int []arr, int low, int hight)
	{
		int pivot = arr[hight];
		int i = low - 1;
		for(int j = low; j < hight; j++)
		{
			if(arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		int temp = arr[i+1];
		arr[i+1] = arr[hight];
		arr[hight] = temp;
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
