package cdac.searching;

import java.util.Scanner;

public class findUsingLinearSearch {
	public static boolean FindingUsingLinear(int []arr, int n, int val)
	{
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == val)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Array n = ");
		int n = scan.nextInt();
		int []arr = new int[100];
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Enter Array[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter value you want find = ");
		int value = scan.nextInt();
		boolean findFound = FindingUsingLinear(arr, n, value);
		if(findFound == true)
		{
			System.out.println("Value = " + value + " Found in Arrays");
		}
		else System.out.println("Value = " + value + " Not Found in arrays");
		scan.close();
	}

}
