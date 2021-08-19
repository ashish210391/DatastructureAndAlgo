package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftViewOfBinaryTree {

    private static Map<Integer,Node> map = new HashMap<>();
    private static void leftView(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();
            int i =0;
            while(i<size){
                Node node = q.poll();
                if(i==0){
                    System.out.println(node.data);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                i++;
            }
        }
    }

    private static void leftViewWithHashing(Node node,int level){

        if( node == null) return;
        if(!map.containsKey(level)){
            map.put(level,node );
        }
        System.out.println("Level-> "+level+" node-> "+node.data);
        leftViewWithHashing(node.left, level+1);
        leftViewWithHashing(node.right, level+1);
        


    }
    public static void main(String[] args) {

        CreateBinaryTree bt = new CreateBinaryTree();
        Node root = bt.createTree();
       // leftView(root);
       leftViewWithHashing(root, 0);
       Stream<Integer> sortedDataStream= map.entrySet().stream().map(e->e.getValue().data).collect(Collectors.toList()).stream().sorted();
       
       sortedDataStream.forEach(System.out::println);
    
    }
}
