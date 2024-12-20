package cdac.recursion;

import java.util.Scanner;

public class MultipleRecursionWrapper {
	public static int Multiple(int a, int b)
	{
		if(a == 1) return b;
		if(b == 1) return a;
		return  a + Multiple(a, b-1);
	}
	public static int multipleWraper(int a, int b)
	{
		boolean positiveChecking = (a < 0) ^ (b < 0);
		
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		int result = Multiple(a, b);
		return positiveChecking ? -result : result;
	}
	public static void main(String[] args) {
		System.out.println("Programming Multiple two number");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = scan.nextInt();
		System.out.println("Enter b = ");
		int b = scan.nextInt();
		
		System.out.println("Result = " + multipleWraper(a, b));
		scan.close();
	}

}
