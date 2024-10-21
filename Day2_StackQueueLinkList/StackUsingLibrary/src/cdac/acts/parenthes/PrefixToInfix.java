package cdac.acts.parenthes;

import java.util.Stack;

public class PrefixToInfix {
	public static boolean isOperator(char c)
	{
		return c == '+' || c == '-' || c == '/' || c == '*';
	}
	public static String PrefixToInfixConvert(String s)
	{
		Stack<String> stack = new Stack<String>();
		for(int i = s.length() - 1; i >= 0; i--)
		{
			char c = s.charAt(i);
			if(Character.isLetter(c))
			{
				stack.push(c + "");
			}
			else if(isOperator(c))
			{
				String operator1 = stack.pop();
				String operator2 = stack.pop();
				String result = "(" + operator1 + " " + c + " " + operator2 + ")";
				stack.push(result);
			}
		}
		return stack.peek();
	}
	public static void main(String arg[])
	{
		System.out.println("Prefix to Infix");
		String prefix = "- + A B - C D"; 
        System.out.println("Prefix: " + prefix); 
        String infix = PrefixToInfixConvert(prefix);
        System.out.println("Infix: " + infix);
    }
}
