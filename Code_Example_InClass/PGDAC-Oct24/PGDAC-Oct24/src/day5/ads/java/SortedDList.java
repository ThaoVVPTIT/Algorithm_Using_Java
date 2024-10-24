package day5.ads.java;

public interface SortedDList {
	void insert(int element);
	void delete(int element);
	void deleteAll(int element);
	boolean search(int element);
	void print();
	void printBackwards();
}
