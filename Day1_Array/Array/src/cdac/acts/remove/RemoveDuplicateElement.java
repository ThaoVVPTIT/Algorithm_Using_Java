package cdac.acts.remove;

import java.util.Scanner;

public class RemoveDuplicateElement {
	public static int removeDuplicateElement(int []arr, int n)
	{
		if(n < 0 || n > arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("Index Out Of Range Exception");
		}
		int k = 1;
		for(int i = 1; i < n; i++)
		{
			if(arr[i] != arr[i-1])
			{
				arr[k] = arr[i];
				k++;
			}
		}
		return k;
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			int[] arr = new int[1000];
			System.out.println("Enter Size of Array");
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.printf("Array[%d] = ", i);
				arr[i] = scan.nextInt();
			}
			int k = removeDuplicateElement(arr, n);
			System.out.print("[");
			for (int i = 0; i < k; i++) {
				System.out.print(arr[i]);
				if (i < k - 1) {
					System.out.print(",");
				}
			}
			System.out.println("]");

		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of range index");
		}
		scan.close();
	}
}
