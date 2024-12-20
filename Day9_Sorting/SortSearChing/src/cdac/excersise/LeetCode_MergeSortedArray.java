package cdac.excersise;

import java.util.Scanner;

public class LeetCode_MergeSortedArray {
	public static void merge(int []arr, int m, int []arr2, int n)
	{
		int i = 0, j = 0;
		int k = 0;
		
		while(i < m && j < n)
		{
			if(arr[i] < arr2[j])
			{
				arr[k] = arr[i];
				i++;
			}
			else
			{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i < m)
		{
			arr[k] = arr[i];
			i++;
			k++;
		}
		while(j < n)
		{
			arr[k] = arr2[j];
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
		int []arr = new int[10];
		int []arr2 = new int[10];
		while(t > 0)
		{
			System.out.println("Enter Size of Arrays 1 m = ");
			int m = scan.nextInt();
			for(int i = 0; i < m; i++)
			{
				System.out.printf("Enter Arrays[%d] = ", i);
				arr[i] = scan.nextInt();
			}
			System.out.println("Enter Size of Arrays 2 n = ");
			int n = scan.nextInt();
			for(int i = 0; i < n; i++)
			{
				System.out.printf("Enter Arrays2[%d] = ", i);
				arr2[i] = scan.nextInt();
			}
			merge(arr, m, arr2, n);
			for(int i = 0; i < n + m; i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
