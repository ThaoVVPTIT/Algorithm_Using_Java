package cdac.acts.stack;

import cdac.acts.exception.StackOverflowException;

public class TestCreateStack {
	public static void main(String arg[]) throws StackOverflowException
	{
		CreateStack stack1 = new CreateStack();
		stack1.FixsizeStack(5);
		stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        for(int i = 0; i < 5; i++)
        {
        	System.out.printf("Stack[%d] = ", i);
        	System.out.println(stack1.pop());
        }
	}
}
