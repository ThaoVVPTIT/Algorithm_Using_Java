package cdac.recursion;

import java.util.Scanner;

public class RemainderTwoNumber {
	public static int remainder(int a, int b)
	{
		if(a < b) return a;
		return remainder(a - b, b);
	}
	
	public static int RemainDerWapper(int a, int b)
	{
		boolean checkPositive = (a < 0) ^ (b < 0);
		 
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		
		int result = remainder(a, b);
		return checkPositive ? -result : result;
	}
	public static void main(String arg[])
	{
		System.out.println("Programming Calculator Remainner");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = scan.nextInt();
		System.out.println("Enter b = ");
		int b = scan.nextInt();
		int result = RemainDerWapper(a, b);
		
		System.out.println("Result = " + result);
		scan.close();
	}
}
