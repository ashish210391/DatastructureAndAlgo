package tree;

import java.util.Stack;

public class InorderTreeTraversal {

    private void inorderTraversal(Node node) {

        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.println(node.data);
        inorderTraversal(node.right);

    }

    private void iterativeInorderTraversal(Node root) {

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(!stack.isEmpty()|| curr!=null){
            if(curr !=null )
            {
                stack.push(curr);
                curr=curr.left;
            }
            else{
                Node node =stack.pop();
                System.out.println(node.data);
                curr=node.right;
            }
        }
    }

    public static void main(String[] args) {

        CreateBinaryTree bt = new CreateBinaryTree();
        Node root = bt.createTree();
        InorderTreeTraversal inorder = new InorderTreeTraversal();
        inorder.inorderTraversal(root);

        System.out.println("Iterative approach");

        inorder.iterativeInorderTraversal(root);
    }

}
