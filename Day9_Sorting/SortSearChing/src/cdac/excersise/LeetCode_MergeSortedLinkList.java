package cdac.excersise;

import java.util.PriorityQueue;

import cdac.nodeList.ListNode;

public class LeetCode_MergeSortedLinkList {
	public static ListNode mergeKLists(ListNode []list)
	{
		if(list == null || list.length == 0)
		{
			return  null;
		}
		PriorityQueue<ListNode> queuePriority = new PriorityQueue<ListNode>((a, b) -> a.data - b.data);
		for(ListNode l : list)
		{
			if(l != null) queuePriority.offer(l);
		}
		ListNode result = new ListNode(0);
		ListNode current = result;
		while(!queuePriority.isEmpty())
		{
			ListNode minNode = queuePriority.poll();
			current.next = minNode;
			current = current.next;
			if(minNode.next != null)
			{
				queuePriority.offer(minNode.next);
			}
		}
		return result.next;
	}
	public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		ListNode[] lists = new ListNode[3];
		lists[0] = new ListNode(1);
		lists[0].next = new ListNode(4);
		lists[0].next.next = new ListNode(5);

		lists[1] = new ListNode(1);
		lists[1].next = new ListNode(3);
		lists[1].next.next = new ListNode(4);

		lists[2] = new ListNode(2);
		lists[2].next = new ListNode(6);
		
		ListNode mergedList = LeetCode_MergeSortedLinkList.mergeKLists(lists);

		System.out.print("Merged list: ");
		printList(mergedList);
	}
}
