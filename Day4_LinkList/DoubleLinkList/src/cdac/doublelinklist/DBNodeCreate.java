package cdac.doublelinklist;

public class DBNodeCreate implements DBListFunction{
	int data;
	DBNode head;
	DBNode tail;
	
	public DBNodeCreate()
	{
		this.data = 0;
	}

	@Override
	public void addAtFront(int element) {
		DBNode newNode = new DBNode(element);
		if(isEmpty())
		{
			tail = newNode;
		}
		else 
		{
			head.previous = newNode;
		}
		/*NewNode is first node*/
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void addAtRear(int element) {
		DBNode newNode = new DBNode(element);
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			/*Set newNode's previous current tail*/
			newNode.previous = tail;
		}
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if(isEmpty())
		{
			return 0;
		}
		int data = head.data;
		
		head = head.next;
		head.previous = null;
		return data;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void print() {
		DBNode current = head;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	@Override
	public void printBackwards() {
		DBNode current = tail;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println(" ");
	}
	
}
