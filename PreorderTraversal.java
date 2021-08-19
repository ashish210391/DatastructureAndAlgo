package tree;

import java.util.Stack;

public class PreorderTraversal {

    private static void preOrderTraversal(Node root) {

        if (root == null)
            return;
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private static void iterativePreorderTraversal(Node root){
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        while(!stack.isEmpty()|| curr!=null){
            if(curr!=null){
                System.out.println(curr.data);
                stack.push(curr);
                curr=curr.left;
            }
            else{
                Node node = stack.pop();
                curr=node.right;
            }
        }


    }

    public static void main(String[] args) {
        CreateBinaryTree bt = new CreateBinaryTree();
        Node root = bt.createTree();
        preOrderTraversal(root);
        System.out.println("After Preorder tree traversal");
        iterativePreorderTraversal(root);
    }
}
