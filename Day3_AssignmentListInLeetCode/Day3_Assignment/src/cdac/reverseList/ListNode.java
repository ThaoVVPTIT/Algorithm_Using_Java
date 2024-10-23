package cdac.reverseList;

public class ListNode {
	int data;
	ListNode next;
	public ListNode()
	{
		
	}
	public ListNode(int val)
	{
		this.data = val;
	}
	public ListNode(int val, ListNode node)
	{
		this.data = val;
		this.next = node;
	}
}
