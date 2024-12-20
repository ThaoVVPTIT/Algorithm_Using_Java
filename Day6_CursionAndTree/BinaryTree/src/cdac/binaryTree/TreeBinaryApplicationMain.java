package cdac.binaryTree;

import java.util.Scanner;

public class TreeBinaryApplicationMain {

	public static void main(String[] args) {
		System.out.println("*************MENU************");
		System.out.println("1. Create Binary Tree");
		System.out.println("2. Display using prinUsingInOrder");
		System.out.println("3. Display using printUsingPostOrder");
		System.out.println("4. Counter Number Of node in Tree");
		System.out.println("5. Counter Leaf Node in Tree");
		System.out.println("6. Counter Number of Node equal Value");
		System.out.println("7. Insert Node = value In Tree");
		System.out.println("8. Exit Programming");
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		do
		{
			System.out.println("Enter case (1, 2, 3, 4, 5, 6, 7) only");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Create Binary Tree");
				tree.createBinaryTree();
				break;
			}
			case 2:
			{
				System.out.println("Display By Using InOrder");
				tree.printUsingInOrder();
				break;
			}
			case 3:
			{
				System.out.println("Display by PostOrder");
				tree.printUsingPostOrder();
				break;
			}
			case 4:
			{
				System.out.println("Counter Number of Node in Tree");
				int counter = tree.counterNumberOfNode();
				System.out.println("Number of Node In Tree = " + counter);
				break;
			}
			case 5:
			{
				System.out.println("Counter Number Of Leaf Node Of Tree");
				int counterLeaf = tree.counterLeafOfNode();
				System.out.println("Counter of Leaf Node = " + counterLeaf);
				break;
			}
			case 6:
			{
				System.out.println("Counter Number Of Node hava Data equal == value");
				System.out.println("Enter the value = ");
				int val = scan.nextInt();
				int counter = tree.counterDataOfNode(val);
				System.out.println("Counter Data of Node Equal value = " + counter);
				break;
			}
			case 7:
			{
				System.out.println("Enter value you want to insert ="); 
				int val = scan.nextInt();
				tree.insertNodeOfTree(val);
				break;
			}
			case 8:
			{
				System.out.println("Exit programming!");
				scan.close();
				break;
			}
			}
		}while(choice != 8);
	}

}
