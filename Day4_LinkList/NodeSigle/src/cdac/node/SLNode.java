package cdac.node;

public class SLNode {
	int data;
	SLNode next;
	public SLNode(int data)
	{
		this.next = null;
		this.data = data;
	}
	public SLNode()
	{
		this.data = 0;
		this.next = null;
	}
}
