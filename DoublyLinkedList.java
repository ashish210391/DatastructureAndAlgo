package lovebabbar;

public class DoublyLinkedList {
    
    private DoublyNode head;


    public void add(int data){

        DoublyNode node = new DoublyNode(data);
        if(head == null){
            this.head=node;
        }else{
            DoublyNode temp = head;
            temp.prev=node;
            head = node;
        }

    }

    public void addToLast(int data){

        DoublyNode node = new DoublyNode(data);
        node.next=null;
        if(head == null){
            this.head = node;
        }else{
            DoublyNode tempNode = this.head;
            while(tempNode.next!=null){
                tempNode=tempNode.next;
            }
            node.prev=tempNode;
            tempNode.next=node;
        }
    }

    public DoublyNode getHead(){
        return this.head;
    }

    public void printList(DoublyNode node ){

        DoublyNode temp = this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
    
        DoublyLinkedList linkedList = new DoublyLinkedList();
        for(int i=0;i<10;i++){
            linkedList.addToLast(i);
        }
        linkedList.printList(linkedList.getHead());
    }
}
