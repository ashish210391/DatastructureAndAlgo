package tree;

public class ConvertToSumTree {

	public int sumTreeNodes(Node node) {
		if (node == null)
			return 0;

		int left = sumTreeNodes(node.left);
		int right = sumTreeNodes(node.right);
		int olddata = node.data;
		node.data = left + right;
		return node.data + olddata;

	}

	public static void main(String[] args) {
		CreateBinaryTree bt = new CreateBinaryTree();
		Node root = bt.createTree();

		ConvertToSumTree sumTree = new ConvertToSumTree();
		sumTree.sumTreeNodes(root);

	}

}
