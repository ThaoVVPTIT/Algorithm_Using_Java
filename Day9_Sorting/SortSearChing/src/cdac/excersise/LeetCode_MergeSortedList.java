package cdac.excersise;

import cdac.nodeList.ListNode;

public class LeetCode_MergeSortedList {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = new ListNode(0);
		ListNode current = result;
		while(list1 != null && list2 != null)
		{
			if(list1.data < list2.data)
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
		else
		{
			current.next = list2;
		}
		return result.next;
	}
	public static void insert(ListNode head, int element)
	{
		ListNode newNode = new ListNode(element);
		if(head == null)
		{
			head = newNode;
			return;
		}
		ListNode current = head;
		ListNode previos = null;
		while(current != null)
		{
			if(current.data > newNode.data)
			{
				break;
			}
			previos = current;
			current = current.next;
		}
		if(previos == null)
		{
			newNode.next = head;
			head = newNode;
			return;
		}
		previos.next = newNode;
		newNode.next = current;
	}
	public static void print(ListNode head)
	{
		ListNode current = head;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String arg[])
	{
		System.out.println("Checking merge List Node ");
		ListNode head = new ListNode(0);
		LeetCode_MergeSortedList.insert(head, 10);
		LeetCode_MergeSortedList.insert(head, 14);
		LeetCode_MergeSortedList.insert(head, 13);
		
		ListNode head2 = new ListNode(2);
		LeetCode_MergeSortedList.insert(head2, 18);
		LeetCode_MergeSortedList.insert(head2, 24);
		
		ListNode result = LeetCode_MergeSortedList.mergeTwoLists(head, head2);
		print(result);
	}
}
