package cdac.sorteddoublyList;


public class SortedDoublyList implements DBList{
	private DBNode head;
	private DBNode tail;
	
	public SortedDoublyList()
	{
		
	}

	@Override
	public void insertNode(int element) {
		DBNode newNode = new DBNode(element);
		/*Step1: Checking list is empty (head = null)*/
		if(isEmpy())
		{
			head = newNode;
			tail = newNode;
		}
		
		DBNode current = head;
		DBNode previous = null;
		while(current != null)
		{
			if(current.data < newNode.data)
			{
				break;
			}
			previous = current;
			current = current.next;
			
		}
		
		if(previous == null)
		{
			newNode.next = head;
			head = newNode;
			return;
		}
		
		previous.next = newNode;
		newNode.next  = current;
	}

	@Override
	public void deleteNode(int element) {
		if(isEmpy())
		{
			return;
		}
		DBNode current = head;
		DBNode previous = null;
		while(current != null)
		{
			if(current.data == element)
			{
				previous.next = current.next;
				return;
			}
			else previous = current;
			current = current.next;
		}
	}

	@Override
	public void deleteAll(int element) {
		
		if(isEmpy())
		{
			return;
		}
		DBNode current = head;
		DBNode previous = null;
		while(current != null)
		{
			if(current.data == element)
			{
				previous.next = current.next;
			}
			else previous = current;
			current = current.next;
		}
	}

	@Override
	public boolean search(int element) {
		if(head == null)
		{
			return false;
		}
		DBNode current = head;
		while(current != null)
		{
			if(current.data == element)
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public void Display() {
		DBNode current = head;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	@Override
	public void DisplayBackYard() {
		DBNode current = tail;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println();
	}
	@Override
	public boolean isEmpy() {
		return head == null;
	}
	
}
