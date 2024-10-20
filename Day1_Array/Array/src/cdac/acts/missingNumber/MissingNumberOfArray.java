package cdac.acts.missingNumber;

import java.util.Scanner;

public class MissingNumberOfArray {
	public static int MissingNumber(int []arr)
	{
		int sumAllElement = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sumAllElement += arr[i];
		}
		int sumEcpected = (arr.length * (arr.length + 1))/2;
		return sumEcpected - sumAllElement;
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = scan.nextInt();
		int []arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("Arrays[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		int number = MissingNumber(arr);
		System.out.println("Number of arrays missing is = " + number);
		scan.close();
	}
}

