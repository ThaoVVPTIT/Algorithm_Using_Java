package cdac.sortingLinear;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int []arr, int n)
	{
		for(int i = 0; i < n - 1; i++)
		{
			int minIndex = i;
			for(int j = i + 1; j < n; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			System.out.print("Step " + (i + 1) + ": ");
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[j] + " ");
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
			selectionSort(arr, n);
		}
		scan.close();
	}
}
