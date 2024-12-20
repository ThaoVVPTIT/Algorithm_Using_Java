package cdac.sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int []arr, int n)
	{
		int step = 1;
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
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
			System.out.print("Step " + step++ + ": ");
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[j]);
				if(j < n - 1) System.out.print(", ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Testing Sorting Selection Sort");
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
			System.out.println("Arrays before Selection Sort is");
			System.out.print("[");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]);
				if(i < n - 1) System.out.print(", ");
			}
			System.out.println("]");
			
			
			System.out.println("Arrays AFTER Selection Sort is");
			selectionSort(arr, n);
		}
		scan.close();
	}
}
