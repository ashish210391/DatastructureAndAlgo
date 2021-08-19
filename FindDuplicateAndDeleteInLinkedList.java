package lovebabbar;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateAndDeleteInLinkedList {

    private static Map<Integer, Node> nodeMap = new HashMap<>();

    FindDuplicateAndDeleteInLinkedList() {
        
    }

    private static void findDuplicate(Node head) {

        Node temp = head;
        
        while (temp!= null) {
            
            if (!nodeMap.containsKey(temp.data))
               nodeMap.put(temp.data, head);
            else {
                temp =deleteNode(temp, head);
            }

            temp = temp.next;
        }

    }

    private static Node deleteNode(Node node, Node head) {
        Node temp = head;
        while (temp.next != node) {
            temp = temp.next;
        }

        Node nodeToBeDeleted = temp.next;
        temp.next = nodeToBeDeleted.next;
        nodeToBeDeleted.next = null;
        node = temp;
        temp = null;	
        return node ;

    }

    private static void printLinkedList(Node head) {
        System.out.println("After deleting the duplicate nodes ");
        Node temp = head;
        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CreateLinkedList linkedList = new CreateLinkedList();
        linkedList.add(4);
       /* linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(3);	
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(4);*/
        Node head = linkedList.add(4);

        findDuplicate(head);
        printLinkedList(head);


    }

}
