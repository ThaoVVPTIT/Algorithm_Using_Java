package cdac.acts.moveZeros;

import java.util.Scanner;

public class MoveZerosInLastArray {
	public static void MoveZerosInLast(int []arr)
	{
		int index = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0)
			{
				arr[index] = arr[i];
				index++;
			}
		}
		for(int i = index; i < arr.length; i++)
		{
			arr[i] = 0;
		}
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Arrays");
		int n = scan.nextInt();
		int []arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("Enter Arrays[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		MoveZerosInLast(arr);
		System.out.println("Array affter move zeros in Last ");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if(i < arr.length - 1)
			{
				System.out.print(",");
			}
		}
		System.out.println("]");
		scan.close();
	}
}
