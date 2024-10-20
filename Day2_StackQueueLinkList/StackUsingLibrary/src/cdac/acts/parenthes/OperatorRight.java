package cdac.acts.parenthes;

import java.util.Stack;

public class OperatorRight {
	public static boolean isValidSynbolPattern(String s)
	{
		Stack<Character> stk = new Stack<Character>();
		if(s == null || s.length() == 0)
		{
			return true;
		}
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ')')
			{
				if(!stk.isEmpty() && stk.peek() == '(')
				{
					stk.pop();
				}
				else return false;
			}else if(s.charAt(i) == ']')
			{
				if(!stk.isEmpty() && stk.peek() == '[')
				{
					stk.pop();
				}
				else return false;
			}
			else if(s.charAt(i) == '}')
			{
				if(!stk.isEmpty() && stk.peek() == '{')
				{
					stk.pop();
				}
				else return false;
			}
			else stk.push(s.charAt(i));
		}
		if(stk.empty()) return true;
		else return false;
	}
	public static void main(String arg[])
	{
		String s = "[()]";
		if(isValidSynbolPattern(s))
		{
			System.out.println("Sysbol oki");
		}
		else System.out.println("Symbol Wrong");
		
	}
}
