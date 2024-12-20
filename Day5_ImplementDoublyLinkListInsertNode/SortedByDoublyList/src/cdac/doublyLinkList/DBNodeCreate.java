package cdac.doublyLinkList;

public class DBNodeCreate implements DBFunctionList{
	DBNode head;
	DBNode tail;
	public DBNodeCreate()
	{
		
	}
	@Override
	public void insertNode(int element) {
		DBNode newNode = new DBNode(element);
		if(isEmpy())
		{
			head = newNode;
			tail = newNode;
			return;
		}
		DBNode current = head;
		DBNode previous = null;
		while(current != null)
		{
			if(current.data > newNode.data)
			{
				break;
			}
			previous = current;
			current  = current.next;
		}
		if(previous == null)
		{
			newNode.next = head;
			head = newNode;
			return;
		}
		previous.next = newNode;
		newNode.next = current;
	}
	@Override
	public void deleteNode(int element) {
		if(isEmpy())
		{
			return;
		}
		DBNode current = head;
		DBNode previous = null;
		if(current.data == element)
		{
			head = head.next; /*delete head out of list*/
			if(head != null)
			{
				head.previous = null;
			}
			else tail = null;
			return;
		}
		
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
		// TODO Auto-generated method stub
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
