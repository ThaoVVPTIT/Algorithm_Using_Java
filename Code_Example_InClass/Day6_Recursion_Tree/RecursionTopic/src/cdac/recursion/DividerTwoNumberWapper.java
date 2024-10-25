package cdac.recursion;
import java.util.Scanner;

public class DividerTwoNumberWapper {
	public static int quote(int a, int b)
	{
		if(a < b) return 0;
		return 1 + quote(a - b, b);
	}
	
	public static int divider(int a, int b)
	{
		if(b < 0)
		{
			return -1;
		}
		/*Checking a, b the same (+) or (-)*/
		boolean negativeProcess = (a < 0) ^ (b < 0);
		
		a = (a < 0) ? -a : a; /*If a < 0 then a = -a*/
		b = (b < 0) ? -b : b;
		
		int result = quote(a, b);
		
		return negativeProcess ? -result : result;
		
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = scan.nextInt();
		System.out.println("Enter b = ");
		int b = scan.nextInt();
		int result = divider(a, b);
		System.out.println("Result = " + result);
		scan.close();
	}
}
