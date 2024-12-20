package cdac.reverseList;



public class ReverseLinkList {
	public static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null)
		{			
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	public static void main(String arg[])
	{
		System.out.println("List Reverse");
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        ListNode newHead = reverseList(head);
        ListNode current = newHead;
        while(current != null)
        {
        	System.out.print(current.data + " ");
        	current = current.next;
        }
	}
}
