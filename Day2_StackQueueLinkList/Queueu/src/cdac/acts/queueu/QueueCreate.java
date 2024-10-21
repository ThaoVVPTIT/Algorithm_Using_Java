package cdac.acts.queueu;


public class QueueCreate implements Queue{
	private int rear;
	private int front;
	private int []DataQueue;
	private int size;
	public QueueCreate(int size)
	{
		this.size = 0;
		this.rear = - 1;
		this.front = 0;
		DataQueue = new int[size];
	}
	@Override
	public void enQueue(int ele) {
		if(isFull())
		{
			return;
		}
		rear = (rear + 1) % DataQueue.length;
		size++;
		DataQueue[rear] = ele;
	}
	@Override
	public int deQueueu() {
		if(isEmpty())
		{
			return -1;
		}
		int ele = DataQueue[front];
		front = (front+1)%DataQueue.length;
		size--;
		return ele;
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	@Override
	public boolean isFull() {
		return size == DataQueue.length;
	}
}
