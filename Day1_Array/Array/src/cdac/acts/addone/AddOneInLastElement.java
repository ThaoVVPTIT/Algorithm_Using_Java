package cdac.acts.addone;

import java.util.Scanner;

public class AddOneInLastElement {
	public static int[] addOneInLastElement(int []arr)
	{
		arr[arr.length - 1]++;
		return arr;
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array after add one in Last Elenment");
		System.out.println("Please enter size of Array");
		int n = scan.nextInt();
		int []arr = new int[n]; 
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Array[%d] = ", i);
			arr[i] = scan.nextInt();
		}
		int []newArray = new int[n];
		newArray = addOneInLastElement(arr);
		System.out.print("[");
		for(int i = 0; i < n; i++)
		{
			System.out.print(newArray[i]);
			if(i < n - 1)
			{
				System.out.print(",");
			}
		}
		System.out.println("]");
		scan.close();
	}
}
