package tree;


public class ConstructBinaryTreeFromInorderAndPreorder {

    private static int preIdx=0;


    private static Node buildTree(int inOrder[],int preOrder[],int startIn,int endIn){

        // return null when no element is found
        if(startIn>endIn)
        return null;

        Node node = new Node(preOrder[preIdx]);
        ++preIdx;
        int inIdx= search(node.data, inOrder,startIn,endIn);

        // return the node when the start index and end index are same i.e we have 
        if(startIn == endIn)
        return node;

        node.left=buildTree(inOrder, preOrder, startIn, inIdx-1);
        node.right= buildTree(inOrder, preOrder, inIdx+1, endIn);

        return node;
    }


    private static void printPostOrder(int inOrder[],int preOrder[],int startIn,int endIn){

        if(startIn>endIn) return;
       int value = preOrder[preIdx];
       ++preIdx;
        if(startIn == endIn){
            System.out.println(value);
                return;
        }
        Node node = new Node(value);
       
        int inIdx = search(node.data, inOrder, startIn, endIn);
        printPostOrder(inOrder, preOrder, startIn, inIdx-1);
        printPostOrder(inOrder, preOrder, inIdx+1, endIn);
        System.out.println(value);

    }

    private static int search(int key, int inOrder[],int start,int end){

        for(int i =0;i<inOrder.length;i++){
            if(inOrder[i] == key)
                return i; 

        }
        return -1;
    }

    public static void main(String[] args) {
        

        int inOrder[] = {4,2,1,7,5,8,3,6};
        int preOrder[] ={1,2,4,3,5,7,8,6};

        // Node node = buildTree(inOrder, preOrder, 0, inOrder.length-1);
        // PostOrderTraversal pot = new PostOrderTraversal();
        // System.out.println("root data =  "+node.data);
        //  pot.postOrder(node);
        // preIdx=0;
         System.out.println("print tree without building the tree");
         printPostOrder(inOrder, preOrder, 0, inOrder.length-1);


    }
    
}
