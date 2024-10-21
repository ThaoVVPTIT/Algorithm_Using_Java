package cdac.acts.queueu;

public class QueueTesting {
	public static void main(String arg[])
	{
		   Queue q = new QueueCreate(5); 

		    q.enQueue(10);
		    q.enQueue(20);
		    q.enQueue(30);
		    q.enQueue(40);
		    q.enQueue(50);
		    for(int i = 0; i < 5; i++)
		    {
		    	System.out.println(q.deQueueu());
		    }
	}
}
