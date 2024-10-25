package cdac.binarytree;

import java.util.Scanner;

public class TesterNode {

	public static void main(String[] args) {
		System.out.println("Print typer printUsingInorder");
		System.out.println("***********MENU**************");
		System.out.println("1. Create Tree Binary");
		System.out.println("2. Print Tree USing PostOrder");
		System.out.println("3. Print Tree Using InorDer");
		System.out.println("4. Counter Node in Tree");
		
		int choice = 0;
		PostOrderPrintln tree = new PostOrderPrintln();
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Enter choice (1,2,3,4,5)");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Create Tree Node");
				tree.Creatree();
				break;
			}
			case 2:
			{
				System.out.println("Print Using PostOrder");
				tree.printUsingPostOrder();
				break;
			}
			case 3:
			{
				System.out.println("Print Using Inorder");
				tree.printUsingInorder();
				break;
			}
			case 4:
			{
				int result = tree.counterNode();
				System.out.println("Number of Node in Tree is = " + result);
				break;
			}
			case 5:
			{
				System.out.println("Exit programing");
				scan.close();
			}
			}
		}while(choice != 5);
	}

}
