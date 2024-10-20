package cdac.acts.stack;

import cdac.acts.exception.StackOverflowException;

public interface Stack {
	public void push(int element) throws StackOverflowException;
	public int pop();
	public boolean isEmpty();
	public boolean isFull();
	public void FixsizeStack(int size);
}
