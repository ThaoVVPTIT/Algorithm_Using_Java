package cdac.recursion;

import java.util.Scanner;

public class MultipleNumberRecursion {
	public static int MultipleRecursion(int a, int b)
	{
		if(a == 1) return b;
		if(b == 1) return a;
		return a + MultipleRecursion(a, b - 1);
	}
	public static int MultipleWapper(int a, int b)
	{
		boolean checkingPositive = (a < 0) ^ (b < 0);
		
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		
		int result = MultipleRecursion(a, b);
		return checkingPositive ? -result : result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Programming Multiple two number a, b using recursion");
		System.out.println("Enter a: ");
		int a = scan.nextInt();
		System.out.println("Enter b: ");
		int b = scan.nextInt();
		
		int multipleResult = MultipleWapper(a, b);
		
		System.out.println("Result of Recursion for Multiple = " + multipleResult);
		scan.close();
	}

}
