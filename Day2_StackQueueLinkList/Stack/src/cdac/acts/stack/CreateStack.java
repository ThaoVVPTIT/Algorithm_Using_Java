package cdac.acts.stack;

import cdac.acts.exception.StackOverflowException;

public class CreateStack implements Stack{
	private int top = -1;
	private int []StackData;
	@Override
	public void push(int element) throws StackOverflowException {
		if(isFull())
		{
			throw new StackOverflowException("Stack is full, cannot push element: " + element);
		}
		top++;
		StackData[top] = element;
	}
	@Override
	public int pop() {
		if(isEmpty())
		{
			return -1;
		}
		int ele = StackData[top];
		top--;
		return ele;
	}


	@Override
	public boolean isEmpty() {
        return top == -1; 
    }

	@Override
    public boolean isFull() {
        return top == StackData.length - 1;
    }
	@Override
	public void FixsizeStack(int size) {
		StackData = new int[size];
		top = -1;	
	}
}
