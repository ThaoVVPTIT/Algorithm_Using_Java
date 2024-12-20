package cdac.excersise;

import java.util.Scanner;

public class QickSortDecensing {
	public static void QickSorted(int []arr, int left, int right)
	{
		if(left > right) return;
		if(left < right)
		{
			int p = partion(arr, left, right);
			QickSorted(arr, left, p - 1);
			QickSorted(arr, p + 1, right);
		}
	}
	public static int partion(int []arr, int left, int right)
	{
		int pivot = arr[right];
		int i = left - 1;
		for(int j = left; j < right; j++)
		{
			if(arr[j] > pivot)
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = temp;
		return i + 1;
	}
	public static void main(String arg[])
	{
		System.out.println("Testing qick sort decensing");
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
		QickSorted(arr, 0, n - 1);
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
			if(i < n - 1) System.out.print(", ");
		}
		System.out.println();
		scan.close();
	}
}
