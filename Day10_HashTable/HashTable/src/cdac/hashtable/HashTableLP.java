package cdac.hashtable;

public class HashTableLP implements HashTable{
	private int size;
	private double factorLoad;
	private Integer []buckets;
	private int keyCount;
	public HashTableLP()
	{
		this.size = 5;
		this.factorLoad = 0.7;
		buckets = new Integer[size];
		keyCount = 0;
	}
	public int modN(int key)
	{
		return key % size;
	}
	private void resizeTable()
	{
		size = size * 2;
		System.out.println("Size new Of Table " + size);
		Integer []oldBuckets = buckets;
		buckets = new Integer[size];
		keyCount = 0;
		for(Integer key : oldBuckets)
		{
			if(key != null) insert(key);
		}
		System.out.println("Rewsize HashTable Name");
	}
	@Override
	public void insert(int element) {
		if(keyCount >= (size*factorLoad))
		{
			resizeTable();
		}
		int bucketId = modN(element);
		if(buckets[bucketId] == null)
		{
			buckets[bucketId] = element;
			++keyCount;
			System.out.println("Storing key " + element + " in bucket #" + bucketId );
			return;
		}
		int i = (bucketId + 1) % size;
		int count = 1;
		while(count < size)
		{
			if(buckets[bucketId] == null)
			{
				buckets[bucketId] = element;
				++keyCount;
				System.out.println("Storing key" + element + "in bucket #" + bucketId);
				return;
			}
			++count;
			i = (i + 1)% size;
		}
		resizeTable();
	}
	@Override
	public boolean search(int element) {
		int bucketId = modN(element);
		if(buckets[bucketId] != null)
		{
			if(buckets[bucketId] == element)
			{
				return true;
			}
		}
		int i = (bucketId + 1) %size;
		int count = 1;
		while(count < size)
		{
			if(buckets[i] == null)
			{
				System.out.println("Linear Probing count: " + count);
				return false;
			}
			if(buckets[i] == element)
			{
				System.out.println("Key " + element + " found in bucket #" + i + " Linear Probing count: " + count);
				return true;
			}
			i = (i + 1) % size;
			++count;
		}
		return false;
	}
}
