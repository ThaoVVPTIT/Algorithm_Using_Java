package day4.ads.java;

public class DLNode {
	public int data;
	public DLNode next;
	public DLNode previous;
	
	public DLNode() {
		data = 0;
		next = null;
		previous = null;
	}
	
	public DLNode(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
}
