package cdac.excersise;

import java.util.Scanner;

public class MergerSortDecensing {
	public static void MergerSorted(int []arr, int left, int right)
	{
		if(left < right)
		{
			int mid = left + (right - left)/2;
			MergerSorted(arr, left, mid);
			MergerSorted(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	public static void merge(int []arr, int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int [] leftArrays = new int[n1];
		int [] rightArrays = new int[n2];
		for(int i = 0; i < n1 ; i++)
		{
			leftArrays[i] = arr[left + i];
		}
		for(int j = 0; j < n2; j++)
		{
			rightArrays[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;
		while(i < n1 && j  < n2)
		{
			if(leftArrays[i] >= rightArrays[j])
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
			j++; k++;
		}
	}
	public static void main(String arg[])
	{
		System.out.println("Testing Merge sort decensing");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Arrays = ");
		int n = scan.nextInt();
		int []arr = new int[100];
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Enter Arrays[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Before Arrays Sort");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
			if(i < n - 1) System.out.print(", ");
		}
		System.out.println();
		System.out.println("After sort using merge sort");
		MergerSorted(arr, 0, n - 1);
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
			if(i < n - 1) System.out.print(", ");
		}
		System.out.println();
		scan.close();
	}
}
