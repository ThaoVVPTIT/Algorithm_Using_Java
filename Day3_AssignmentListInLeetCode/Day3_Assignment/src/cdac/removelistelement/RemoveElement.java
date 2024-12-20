package cdac.removelistelement;;
public class RemoveElement {
	ListNode headr;
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(-1);
		/*Lien ket node dummy nay voi List */
		dummy.next = head;
		
		ListNode previous = dummy;
		ListNode current  = head;
		while(current != null)
		{
			if(current.val == val)
			{
				previous.next = current.next;
			}
			else
			{
				previous = current;
			}
			current = current.next;
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        ListNode newHead = re.removeElements(head, 6);
        ListNode current = newHead;
        while(current != null)
        {
        	System.out.print(current.val + " ");
        	current = current.next;
        }
	}
}
