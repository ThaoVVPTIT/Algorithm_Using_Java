package day2.ads.java;

public class FixedSizeStack implements Stack {
	private int[] stackData;
	private int top;
	
	public FixedSizeStack(int n) {
		stackData = new int[n];
		top = -1;
	}

	@Override
	public void push(int element) {
		if (isFull()) {
			// TODO: Throw appropriate exception.
			return;
		}
		
		++top;
		stackData[top] = element;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			// TODO: Throw appropriate exception.
			return -1;
		}

		int result = stackData[top];
		--top;

		return result;
	}

	@Override
	public int peek() {
		if (isEmpty()) {
			// TODO: Throw appropriate exception.
			return -1;
		}

		return stackData[top];
	}

	@Override
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (top == (stackData.length - 1)) {
			return true;
		}
		return false;
	}

}
