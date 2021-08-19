package lovebabbar;

public class ReverseLinkedList {

    private Node reverse(Node head) {
        Node curr = head;
        Node next = null;
        Node prev = null;

        while (curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next=prev;

        return curr;

    }

    private void printReverseList(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();

        ReverseLinkedList revList = new ReverseLinkedList();

        list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        Node head = list.add(5);

        Node rev_head = revList.reverse(head);
        revList.printReverseList(rev_head);

    }
}
