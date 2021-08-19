package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VeritcalOrderTraversalBinaryTree {


    private static Map<Integer,List<Node>> map = new TreeMap<>();
    
    private static void verticalOrderTraversal(Node node, int dist){
        if(node == null)return;
        if(!map.containsKey(dist)){
            List<Node> nodeList = new ArrayList<>();
            nodeList.add(node);
            map.put(dist, nodeList);
        }
        else{
            List<Node> list = map.get(dist);
            list.add(node);
            map.put(dist,list);
        }

        verticalOrderTraversal(node.left, dist-1);
        verticalOrderTraversal(node.right, dist+1);
    }

private static void printNodesFromMap(){
    map.entrySet().stream().forEach(e->e.getValue().stream().forEach(item->
    System.out.print(item.data+",")
    ));
}
    public static void main(String[] args) {
        CreateBinaryTree bt = new CreateBinaryTree();
        Node root  = bt.createTree();
        verticalOrderTraversal(root, 0);
        printNodesFromMap();
    }
    
}
