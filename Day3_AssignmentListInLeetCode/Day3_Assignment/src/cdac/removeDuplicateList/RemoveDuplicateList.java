package cdac.removeDuplicateList;


public class RemoveDuplicateList {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		ListNode current = head;
		while(current != null)
		{
			ListNode currentruner = current;
			while(currentruner.next != null)
			{
				if(currentruner.next.val == current.val)
				{
					currentruner.next = currentruner.next.next;
				}
				else currentruner = currentruner.next;
			}
			current = current.next;
		}
		return head;
	}
	public static void main(String[] args) {
		RemoveDuplicateList re = new RemoveDuplicateList();
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        ListNode newHead = re.deleteDuplicates(head);
        ListNode current = newHead;
        while(current != null)
        {
        	System.out.print(current.val + " ");
        	current = current.next;
        }
	}

}
