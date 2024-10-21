package cdac.acts.parenthes;

import java.util.Stack;

public class PrefixSymbol {

    public static int priority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String applyOperator(char operator, String operand1, String operand2) {
        return operator + operand1 + operand2;
    }

    public static String infixToPrefix(String s) {
        Stack<Character> stack = new Stack<>(); 
        Stack<String> operandStack = new Stack<>(); 
        s = s.replaceAll("\\s+", "");
        
        for(int i = s.length() - 1; i >= 0; i--)
        {
        	char c = s.charAt(i);
        	if(c == ')' || c == '}')
        	{
        		stack.push(c);
        	}
        	else if(c == '(' || c == '{')
        	{
        		while(!stack.empty() && stack.peek() != ')')
        		{
        			String result = applyOperator(stack.pop(), operandStack.pop(), operandStack.pop());
        			operandStack.push(result);
        		}
        		stack.pop();
        	}
        	else if(Character.isLetter(c))
        	{
        		operandStack.push(c + "");
        	}
        	else
        	{
        		while(!stack.empty() && priority(c) < priority(stack.peek()))
        		{
        			String result = applyOperator(stack.pop(), operandStack.pop(), operandStack.pop());
        			operandStack.push(result);
        		}
        		stack.push(c);
        	}
        }
        while(!stack.isEmpty())
        {
        	String result = applyOperator(stack.pop(), operandStack.pop(), operandStack.pop());
        	operandStack.push(result);
        }
        return operandStack.peek();
    }

    public static void main(String[] args) {
        System.out.println("Infix to Prefix");
        String expression = "(A + B) - (C - D)";
        String prefix = infixToPrefix(expression);
        System.out.println("Prefix: " + prefix);
    }
}
