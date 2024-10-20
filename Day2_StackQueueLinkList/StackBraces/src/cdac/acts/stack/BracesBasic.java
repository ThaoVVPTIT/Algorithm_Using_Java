package cdac.acts.stack;

public class BracesBasic {
	public static void CheckingBraces(String s)
	{
		StackCreate stack = new StackCreate(s.length());
		StringBuilder bracesRight = new StringBuilder();
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c == '[')
			{
				stack.push(c);
				bracesRight.append(c);
			}
			else if(c == ')' || c == '}' || c == ']')
			{
				if(stack.isEmpty())
				{
					System.out.println("Wrong the braces");
					return;
				}
				char top = stack.pop();
				if((top == ')' && top != '(') ||
					top == '}' && top != '{'  ||
					top == ']' && top != '[')
				{
					System.out.println("Wrong braces");
				}
				bracesRight.append(c);
			}
			else
			{
				bracesRight.append(c);
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("Braces is correct " + bracesRight.toString());
		}else System.out.println("Braces inCorrect");
	}
	public static void main(String arg[])
	{
		
		String c = "(A - B) + (C - D)";
		CheckingBraces(c);
	}
}
