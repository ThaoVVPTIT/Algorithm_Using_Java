package cdac.sortingLinear;

import java.util.Scanner;

public class BubbleSortOptimize {
	public static void bubbleSortOptimization(int []arr, int n)
	{
		int step = 1;
		boolean swap = false;
		for(int i = 0; i < n - 1; i++)
		{
			swap = false;
			for(int j = 0; j < n - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap = true;
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			System.out.print("Step " + step++ + ": ");
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			if(!swap) {
				break;
			}
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
			bubbleSortOptimization(arr, n);
		}
		scan.close();
	}
}
