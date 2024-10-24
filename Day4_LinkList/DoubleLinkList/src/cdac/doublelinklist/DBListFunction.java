package cdac.doublelinklist;

public interface DBListFunction {
	void addAtFront(int element);
	void addAtRear(int element);
	int deleteFirstNode();
	boolean isEmpty();
	void print();
	void printBackwards();
}
