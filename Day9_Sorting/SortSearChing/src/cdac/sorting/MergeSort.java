package cdac.sorting;

import java.util.Scanner;

public class MergeSort {
	public static void MergeSorted(int []arr, int l, int r)
	{
		if(l > r) return;
		if(l < r)
		{
			int mid = l + ( r - l)/2;
			MergeSorted(arr, l, mid - 1);
			MergeSorted(arr, mid + 1, r);
			merge(arr, l, mid, r);
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
		for(int j = 0; j < n2; j++)
		{
			rightArrays[j] = arr[mid + 1 + j];
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
		System.out.println("Testing Sorting Using MergeSort");
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
			System.out.println("Arrays before Sorting using Merge Sort is");
			System.out.print("[");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]);
				if(i < n - 1) System.out.print(", ");
			}
			System.out.println("]");
			
			
			System.out.println("Arrays AFTER using Merge Sort is");
			MergeSorted(arr, 0, n - 1);
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
