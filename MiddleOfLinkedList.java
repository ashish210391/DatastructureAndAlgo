package lovebabbar;

public class MiddleOfLinkedList {

    private int findMiddle(Node head) {

        Node fast = head;
        Node slow = head;


        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }

    public static void main(String[] args) {

        CreateLinkedList list = new CreateLinkedList();
        list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
         list.add(5);
        Node head = list.add(6);

        MiddleOfLinkedList middle = new MiddleOfLinkedList();
        int middleElement = middle.findMiddle(head);
        System.out.println("Middle element == " + middleElement);
    }
}
