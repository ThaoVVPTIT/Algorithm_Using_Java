package cdac.acts.queueu;

public interface Queue {
	public void enQueue(int ele);
	public int deQueueu();
	public boolean isEmpty();
	public boolean isFull();
}
