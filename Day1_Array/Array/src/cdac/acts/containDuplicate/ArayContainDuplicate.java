package cdac.acts.containDuplicate;

import java.util.Scanner;

public class ArayContainDuplicate {
	public static boolean DuplicateContainElemnt(int []arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Checking Contain duplicate element in array");
		System.out.println("Enter size of Array");
		int n = scan.nextInt();
		int []arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Arrays [%d] = ", i);
			arr[i] = scan.nextInt();
		}
		boolean checking = DuplicateContainElemnt(arr);
		System.out.println("Is Duplicate contain = " + checking);
		scan.close();
	}
}
