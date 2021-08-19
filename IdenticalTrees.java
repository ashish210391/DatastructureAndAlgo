package tree;

public class IdenticalTrees {

	public boolean isIdenticalTree(Node x, Node y) {

		if (x == null && y == null)
			return true;
		if (x.data == y.data)
			return true;

		boolean isLeftTreeIdentical = isIdenticalTree(x.left, y.left);
		boolean isRightTreeIdentical = isIdenticalTree(x.right, y.left);

		return isLeftTreeIdentical && isRightTreeIdentical;
	}

	public static void main(String[] args) {
		CreateBinaryTree bt1 = new CreateBinaryTree();
		CreateBinaryTree bt2 = new CreateBinaryTree();
		Node n1 = bt1.createTree();
		Node n2 = bt2.createTree();

		IdenticalTrees identicalTrees = new IdenticalTrees();
		boolean identical = identicalTrees.isIdenticalTree(n1, n2);
		if (identical) {
			System.out.println("Trees are identical");
		} else {
			System.out.println("Trees are not identical");
		}

	}

}
