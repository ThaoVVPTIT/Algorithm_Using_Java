package cdac.sortingLinear;

import java.util.Scanner;

public class MergeSorted {
	public static void MergeSort(int []arr, int low , int high)
	{
		if(low > high) return;
		if(low < high)
		{
			int mid = low + (high - low)/2;
			MergeSort(arr, low, mid - 1);
			MergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	public static void merge(int []arr, int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int []leftArrays = new int[n1];
		int []rightArrays = new int[n2];
		for(int i = 0; i < n1; i++)
		{
			leftArrays[i] = arr[left + i];
		}
		for(int i = 0; i < n2; i++)
		{
			rightArrays[i] = arr[mid + 1 + i];
		}
		int i = 0, j = 0;
		int k = left;
		while(i < n1 && j < n2)
		{
			if(leftArrays[i] <= rightArrays[j])
			{
				arr[k] = leftArrays[i];
				i++;
			}
			else
			{
				arr[k] = rightArrays[j];
				j++;
			}
			k++;
		}
		while(i < n1)
		{
			arr[k] = leftArrays[i];
			i++;
			k++;
		}
		while(j < n2)
		{
			arr[k] = rightArrays[j];
			j++;
			k++;
		}
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
			MergeSort(arr, 0, n - 1);
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
