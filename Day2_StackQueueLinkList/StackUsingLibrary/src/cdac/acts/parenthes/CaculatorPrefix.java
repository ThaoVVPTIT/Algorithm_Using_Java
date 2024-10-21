package cdac.acts.parenthes;

import java.util.Stack;

public class CaculatorPrefix {
	public static int operator(char operators, int par1, int par2)
	{
		switch(operators)
		{
		case '+':
		{
			return par1 + par2;
		}
		case '-':
		{
			return par1 - par2;
		}
		case '/':
		{
			return par1 / par2;
		}
		case '*':
		{
			return par1 * par2;
		}
		}
		return -1;
	}
	public static int Calculate(String s)
	{
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = s.length() - 1; i >= 0; i--)
		{
			char c = s.charAt(i);
			if(Character.isDigit(c))
			{
				stack.push(c - '0');
			}
			else if(c == '+' || c == '-' || c == '*' || c == '/')
			{
				int op1 = stack.pop();
				int op2 = stack.pop();
				int result = operator(c, op1, op2);
				stack.push(result);
			}
		}
		return stack.peek();
	}
	public static void main(String arg[])
	{
		String cal = "-+57-53";
		String cal1 = "*+45-23";
		int value = Calculate(cal1);
		int value1 = Calculate(cal);
		System.out.println(value);
		System.out.println(value1);
	}
}
