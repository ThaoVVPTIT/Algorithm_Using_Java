package cdac.acts.stack;

public interface Stack {
	public void push(char c);
	public char pop();
	public void FixSize(int size);
	public boolean isEmpty();
	public boolean isFull();
}
