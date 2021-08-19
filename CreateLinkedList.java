package lovebabbar;

public class CreateLinkedList {

    private Node head;

    private void addNodeAtBeg(int data) {

        Node node = new Node(data);
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    private void addNodeAtEnd(int data) {

        Node node = new Node(data);
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }
    }

    private void addNodeAtPos(int data, int pos) {

        if (pos < 1) {
            System.out.println("Not a valid position");
        } else if (pos == 1) {
            Node node = new Node(data);
            node.next = head;
            head = node;
        } else {
            int counter = 1;
            Node node = head;
            Node newnode = new Node(data);
            while (counter < pos - 1 && node.next != null) {
                node = node.next;
                ++counter;
            }
            newnode.next = node.next;
            node.next = newnode;

        }

    }

    private void delete(int pos) {

        if (pos < 1) {
            System.out.println("Invalid position");
        } else if (pos == 1) {
            Node temp = head.next;
            head.next = null;
            head = temp;
            System.out.println("Deleted node == " + temp.data);
        } else {
            Node temp = head;
            int count = 1;
            while (count < pos - 1 && temp.next != null) {
                temp = temp.next;
                ++count;
            }
            Node nodeToBeDeleted = temp.next;
            temp.next = nodeToBeDeleted.next;
            nodeToBeDeleted.next = null;
            System.out.println("Deleted node == " + nodeToBeDeleted.data);

        }
    }

    public Node add(int data) {
        addNodeAtEnd(data);
        return head;
    }

    private void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CreateLinkedList list = new CreateLinkedList();

        // list.addNodeAtBeg(1);
        // list.addNodeAtBeg(2);
        // list.addNodeAtBeg(3);
        // list.addNodeAtBeg(4);
        // list.addNodeAtBeg(5);

        list.addNodeAtEnd(1);
        list.addNodeAtEnd(2);
        list.addNodeAtEnd(3);
        list.addNodeAtEnd(5);

        list.addNodeAtPos(4, 4);
        list.addNodeAtPos(6, 6);
        // list.addNodeAtPos(0, 1);
        // list.addNodeAtPos(10, 10);

        System.out.println("Before deleting the node== ");

        list.printLinkedList();

        list.delete(4);
        list.delete(5);
        System.out.println("After deleting the node== ");

        list.printLinkedList();

    }

}
