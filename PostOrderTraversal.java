package tree;

import java.util.Stack;

public class PostOrderTraversal {

	public void postOrder(Node node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

	public void postOrderTraversalIterative(Node node) {

		Node curr = node;
		Stack<Node> stack = new Stack<>();
		while (!stack.isEmpty() || curr != null) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				Node nodePopped = stack.pop();
				if(nodePopped.right==null){
					System.out.println(nodePopped.data);
					curr=stack.peek().right;
				}else{	
					curr=nodePopped.right;
				}

			}
		}

	}

	public static void main(String[] args) {

		CreateBinaryTree bt = new CreateBinaryTree();
		Node root = bt.createTree();
		PostOrderTraversal pot = new PostOrderTraversal();
		pot.postOrder(root);
		System.out.println("-----post order traversal------");
		pot.postOrderTraversalIterative(root);

	}

}
