package tree;

import java.util.Map;
import java.util.TreeMap;

public class TopViewBinaryTree {

    private static Map<Integer,Pair> map = new TreeMap<>();

    private static void topViewBinaryTree(Node node , int distance,int level){
        
        if(node == null) return ;

        if(!map.containsKey(distance)|| level<map.get(distance).level){
            map.put(distance,Pair.of(node.data, level));
        }

        topViewBinaryTree(node.left, distance-1, level+1);
        topViewBinaryTree(node.right, distance+1, level+1);
    }

    public static void main(String[] args) {
        CreateBinaryTree bt = new CreateBinaryTree();
        Node root = bt.createTree();
        topViewBinaryTree(root, 0,0);
        map.entrySet().stream().forEach(e->System.out.println(e.getValue().data));

    }
    
    private static class Pair{
        public int data;
        public int level;

        public Pair(int data,int level){
            this.data=data;
            this.level=level;
        }

        public static  Pair of(int data,int level){
            return new Pair(data,level);
        }
    }
}
