package cdac.sorting;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int []arr, int n)
	{
		int step = 1;
		for(int i = 1; i < n; i++)
		{
			int pos = i - 1;
			int minValue = arr[i];
			while(pos >= 0 && minValue < arr[pos])
			{
				arr[pos+1] = arr[pos];
				pos--;
			}
			arr[pos+1] = minValue;
			System.out.print("Step " + step++ + ": ");
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
		System.out.println("Testing Sorting Using Insertion Sort");
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
			System.out.println("Arrays before Sorting ");
			System.out.print("[");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]);
				if(i < n - 1) System.out.print(", ");
			}
			System.out.println("]");
			
			
			System.out.println("Arrays AFTER Sorting using Selection Sort");
			insertionSort(arr, n);
		}
		scan.close();
	}
}
