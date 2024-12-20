package cdac.recursion;

import java.util.Scanner;

public class DividerRecursionWrapper {
	public static int divider(int a, int b)
	{
		if(a < b) return a;
		return 1 + divider(a - b, b);
	}
	public static int dividerWrapper(int a, int b)
	{
		boolean checkingPositive = (a < 0) ^ (b < 0);
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		int result = divider(a, b);
		return checkingPositive ? -result : result;
	}
	public static void main(String[] args) {
		System.out.println("Programming divider using recursion and wapper positive");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = scan.nextInt();
		System.out.println("Enter b = ");
		int b = scan.nextInt();
		
		System.out.println("Result = " + dividerWrapper(a, b));
		scan.close();
	}

}
