package cdac.sortingLinear;

import java.util.Scanner;

public class InSertionSort {
	public static void inSertionSort(int []arr, int n)
	{
		int step = 1;
		for(int i = 1; i < n; i++)
		{
			int k = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > k)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = k;
			System.out.print("Step " + step++ + ": ");
			for(int l = 0; l < n; l++)
			{
				System.out.print(arr[l] + " ");
			}
			System.out.println();
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
			inSertionSort(arr, n);
		}
		scan.close();
	}
}
