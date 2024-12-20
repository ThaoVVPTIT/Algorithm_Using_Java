package cdac.recursion;

import java.util.Scanner;

public class ModuloRecursionWapper {
	public static int modulation(int a, int b)
	{
		if(a < b) return a;
		return modulation(a - b, b);
	}
	public static int ModulationWrapper(int a, int b)
	{
		boolean positiveChecking = (a < 0) ^ (b < 0);
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		int result = modulation(a, b);
		return positiveChecking ? -result : result;
	}
	public static void main(String[] args) {
		System.out.println("Programming ModuloRecursion");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = scan.nextInt();
		System.out.println("Enter b = ");
		int b = scan.nextInt();
		int result = ModulationWrapper(a, b);
		System.out.printf("Modulation: %d  Mod %d = %d ", a, b, result);
		scan.close();

	}

}
