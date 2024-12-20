package cdac.searching;

import java.util.Scanner;

public class FindUsingBinarySearching {
	public static boolean findUsingBinarySearchings(int []arr, int n, int val)
	{
		int left = 0;
		int right = n - 1;
		while(left < right)
		{
			int mid = left + (right - left)/2;
			if(arr[mid] == val)
			{
				return true;
			}
			if(arr[mid] < val)
			{
				left = mid + 1;
			}
			else right = mid - 1;
		}
		return false;
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
			System.out.println("Enter Value want searching val = ");
			int val = scan.nextInt();
			boolean FindFound = findUsingBinarySearchings(arr, n, val);
			if(FindFound == true)
			{
				System.out.println("FOUND " + val + " in Arrays");
			}
			else System.out.println("NOT FOUND " + val + " in Arrays");
		}
		scan.close();
	}
}
