package cdac.converBinaryToDecimal;



public class ConvertBinaryToDecimal {
	public static int getDecimalValue(ListNode head) {
		if(head == null)
		{
			return 0;
		}
		ListNode current = head;
		int sum = 0;
		while(current != null)
		{
			sum = (sum << 1) | current.val;
			current = current.next;
		}
		return sum;
	}
	public static void main(String arg[])
	{
		System.out.println("List Reverse");
		ListNode head = new ListNode();
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(1);
        int newHead = getDecimalValue(head);
        System.out.println(newHead);
	}
}
