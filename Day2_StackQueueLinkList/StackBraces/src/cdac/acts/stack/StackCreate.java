package cdac.acts.stack;

public class StackCreate implements Stack{
	private int top;
	private char []StackData;
	public StackCreate(int size)
	{
		top = -1;
		StackData = new char[size];
	}
	@Override
	public void push(char c) {
		if(isFull())
		{
			return;
		}
		top++;
		StackData[top] = c;
	}

	@Override
	public char pop() {
		if(isEmpty())
		{
			return '\0';
		}
		char ele = StackData[top];
		top--;
		return ele;
	}

	@Override
	public void FixSize(int size) {
		StackData = new char[size];
		top = -1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == StackData.length - 1;
	}
	
}
