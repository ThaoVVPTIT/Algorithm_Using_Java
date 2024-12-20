package cdac.node;


public class SortedSigleList implements SortedList {
	private SLNode head;

	public SortedSigleList() {
		this.head = null;
	}

	@Override
	public void insert(int element) {
		SLNode newNode = new SLNode(element);
		if(head == null)
		{
			head = newNode;
		}
		SLNode current = head;
		SLNode previos = null;
		while(current != null)
		{
			/*Find value of anyNode in List 
			 * but if value at here greater than value insert.
			 * We are break it */
			if(current.data > newNode.data)
			{
				
				break;
			}
			/*finding successful -> previos = currentnode*/
			previos = current;
			/*Node greater than will need change*/
			current = current.next;
		}
	
		/*Checking list only node*/
		if(previos == null)
		{
			newNode.next = head;
			head = newNode;
			return;
		}
		/*Neu nhu khong phai chen vao dau danh sach
		 * NewNode = node Truoc do
		 * Newnode tro toi node hien ta*/
		
		previos.next = newNode;
		newNode.next = current;
	}

	@Override
	public void delete(int element) {
		
	}

	@Override
	public void deleteAll(int element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean search(int element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		SLNode current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}
}
