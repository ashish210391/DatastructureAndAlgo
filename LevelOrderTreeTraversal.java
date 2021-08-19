package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTreeTraversal {

    private static void printLevelOrder(Node root) {

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.poll();
            System.out.println(node.data);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }

        }
        
    }

    public static void main(String[] args) {
        CreateBinaryTree bt = new CreateBinaryTree();
        Node root = bt.createTree();
        printLevelOrder(root);
    }

}