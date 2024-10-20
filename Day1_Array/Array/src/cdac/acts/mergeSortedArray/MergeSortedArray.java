package cdac.acts.mergeSortedArray;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while(i >= 0 && j >= 0)
		{
			if(nums1[i] > nums2[j])
			{
				nums1[k] = nums1[i];
				i--;
			}
			else
			{
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		while(j >= 0)
		{
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	}
	public static void main(String arg[])
	{
		int []num1 = new int [6];
		num1[0] = 1;
		num1[1] = 4;
		num1[2] = 5;
		int []num2 = {2,5,7};
		merge(num1, 3, num2, 3);
		for(int i = 0; i < num1.length; i++)
		{
			System.out.println(num1[i]);
		}
	}
}
