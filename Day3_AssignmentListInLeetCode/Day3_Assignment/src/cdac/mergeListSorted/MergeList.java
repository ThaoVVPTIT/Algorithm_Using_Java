package cdac.mergeListSorted;

public class MergeList {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		while(list1 != null && list2 != null)
		{
			if(list1.val < list2.val)
			{
				current.next = list1;
				list1 = list1.next;
			}
			else
			{
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		if(list1 != null)
		{
			current.next = list1;
		}
		else if(list2 != null)
		{
			current.next = list2;
		}
		return dummy.next;
	}
	public static void main(String arg[]) {
		System.out.println("merge List");
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		
		ListNode merge = mergeTwoLists(list1, list2);
		ListNode current = merge;
		while(current != null)
		{
			System.out.print(current.val + " ");
			current = current.next;
		}
	}
}
