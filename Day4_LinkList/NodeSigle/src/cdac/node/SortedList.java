package cdac.node;

public interface SortedList {
	void insert(int element);
	void delete(int element);
	void deleteAll(int element);
	boolean search(int element);
	void print();
}
