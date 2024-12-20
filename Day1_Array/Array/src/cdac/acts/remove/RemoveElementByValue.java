package cdac.acts.remove;
import java.util.Scanner;
import cdac.acts.exception.NotFoundElementValueException;

public class RemoveElementByValue {
	public static int removeElementByValue(int arr[], int val) throws NotFoundElementValueException
	{
		int k = 0;
		boolean checking = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != val)
			{
				arr[k] = arr[i];
				k++;
				checking = true;
			}
		}
		if(checking == false)
		{
			throw new NotFoundElementValueException("Not Found Element Value you want to delete it In Arrays");
		}
		return k;
	}
	public static void main(String arg[]) throws NotFoundElementValueException
	{
		Scanner scan = new Scanner(System.in);
		int test;
		System.out.println("Enter Number of Test you want ");
		test = scan.nextInt();
		
		for(int i = 0; i < test; i++)
		{
			System.out.println("Enter size of Array");
			int n = scan.nextInt();
			int []arr = new int [n];
			for(int j = 0; j < n; j++)
			{
				System.out.printf("Please enter Array[%d] = ", j);
				arr[j] = scan.nextInt();
			}
			System.out.println("Enter the value you want to remove it in List");
			int val = scan.nextInt();
			int k = removeElementByValue(arr, val);
			System.out.println("List affter remove is ");
			System.out.print("[");
			for(int m = 0; m < k; m++)
			{
				System.out.print(arr[m]);
				if(m < k - 1)
				{
					System.out.print(",");
				}
			}
			System.out.println("]");
		}
		scan.close();
	}
}
