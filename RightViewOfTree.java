package tree;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RightViewOfTree {

    private static Map<Integer,Integer> map = new HashMap<>();

    private static void printRightViewTree(Node root) {

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int num_of_child_counter = 0;
            while (num_of_child_counter < size) {
                Node node = q.poll();
                if (num_of_child_counter == 0) {
                    System.out.println(node.data);
                }
                if (node.right != null)
                    q.add(node.right);
                if (node.left != null)
                    q.add(node.left);

                    num_of_child_counter++;

            }

        }

    }

    private static void printRightViewWithHashing(Node node , int level){

        if( node == null) return;

        if(!map.containsKey(level))
            map.put(level,node.data);

            printRightViewWithHashing(node.right, level+1);
            printRightViewWithHashing(node.left, level+1);
    }

    public static void main(String[] args) {
        CreateBinaryTree bt = new CreateBinaryTree();
        Node root = bt.createTree();
      //  printRightViewTree(root);

      printRightViewWithHashing(root,0);
      Stream<Integer> dataListStream = map.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList()).stream().sorted();
        dataListStream.forEach(System.out::println);
    }
}
