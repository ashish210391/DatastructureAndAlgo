package tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BottomViewBinaryTree {

    private static Map<Integer,Pair> map= new TreeMap();

    private static void bottomView(Node node, int dist,int level){

        if(node == null) return;
         
        if(!map.containsKey(dist) || map.get(dist).level<level){
            map.put(dist, Pair.of(node.data, level));
        }

        bottomView(node.left, dist-1, level+1);
        bottomView(node.right, dist+1, level+1);
    }

    public static void main(String[] args) {
        
        CreateBinaryTree bt = new CreateBinaryTree();
        Node root = bt.createTree();
        bottomView(root, 0, 1);
        map.entrySet().stream().forEach(e->System.out.println(e.getValue().data));
    }


    private static class Pair{
        private int data;
        private int level;

        private Pair(int data,int level){
            this.data=data;
            this.level=level;
        }

        private static Pair of(int data,int level){
            return new Pair(data,level);
        }
    }
    
}
