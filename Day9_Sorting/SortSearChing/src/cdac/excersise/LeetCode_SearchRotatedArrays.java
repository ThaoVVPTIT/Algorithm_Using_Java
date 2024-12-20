package cdac.excersise;

import java.util.Scanner;

public class LeetCode_SearchRotatedArrays {
	public static int search(int []arr, int target, int n)
	{
		if(arr == null || n == 0) return -1;
		int left = 0, right = n - 1;
		while(left <= right)
		{
			int mid = left + (right - left)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[left] <= arr[mid])
			{
				if(arr[left] <= target && target < arr[mid])
				{
					right = mid - 1;
				}
				else left = mid + 1;
			}
			else
			{
				if(arr[mid] < target && target <= arr[right])
				{
					left = mid + 1;
				}
				else right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String arg[])
	{
		System.out.println("Checking Search Rotated Arrays");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of arrays = ");
		int n = scan.nextInt();
		int []arr = new int[100];
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Enter Arrays[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter target = ");
		int target = scan.nextInt();
		int val = search(arr, target, n);
		System.out.println("Vale = " + val);
		scan.close();
	}
}
