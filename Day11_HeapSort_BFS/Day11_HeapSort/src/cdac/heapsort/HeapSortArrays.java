package cdac.heapsort;

import java.util.Scanner;

public class HeapSortArrays {
	private static void heapsorthelper(int []arr, int n, int i)
	{
		int lagest = i;
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		if(left < n && arr[left] > arr[lagest])
		{
			lagest = left;
		}
		if(right < n && arr[right] > arr[lagest])
		{
			lagest = right;
		}
		if(lagest != i)
		{
			int swap = arr[i];
			arr[i] = arr[lagest];
			arr[lagest] = swap;
			heapsorthelper(arr, n, lagest);
		}
	}
	public static void HeapSorted(int []arr, int n)
	{
		for(int i = n / 2 - 1; i >= 0; i--)
		{
			heapsorthelper(arr, n, i);
		}
		for(int i = n - 1; i >= 0; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapsorthelper(arr, i, 0);
		}
	}
	public static void main(String arg[])
	{
		System.out.println("Checking HeapSort running");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Arrays");
		int n = scan.nextInt();
		int []arr = new int[1090];
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Enter Arrays[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		HeapSorted(arr, n);
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}
