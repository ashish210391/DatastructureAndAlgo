package tree;

import java.util.Scanner;

public class CreateBinaryTree {
	Scanner sc;

	public CreateBinaryTree() {
		sc = new Scanner(System.in);
	}

	public Node createTree() {

		System.out.println("Enter the data");
		int data = sc.nextInt();

		if (data == -1)
			return null;

		Node node = new Node(data);

		System.out.println("Enter the left for " + data);
		node.left = createTree();

		System.out.println("Enter the right for " + data);
		node.right = createTree();

		return node;

	}

	public static void main(String[] args) {
		CreateBinaryTree bt = new CreateBinaryTree();
		Node root = bt.createTree();
		System.out.println("Root is " + root.data);
	}

}
