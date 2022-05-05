public class DS03SinglyLinkedList {
    public static void main(String args[]) {
        // Create singly linked list
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // Create the head node i.e. first node and assign value
        singlyLinkedList.head = new SinglyLinkedList.Node(1);

        // Create other nodes and assign values
        SinglyLinkedList.Node two = new SinglyLinkedList.Node(2);
        SinglyLinkedList.Node three = new SinglyLinkedList.Node(3);

        // Connect the nodes
        singlyLinkedList.head.next = two;
        two.next = three;

        // printing node-value
        while (singlyLinkedList.head != null) {
            System.out.print(singlyLinkedList.head.data + " ");
            singlyLinkedList.head = singlyLinkedList.head.next;
        }
    }
}

/**
 * A series of connected nodes (each stores a data and address of next node).
 */
class SinglyLinkedList {
    //* Fields
    Node head;

    /**
     * Node is an inner class, with static modifier for direct use without instantiating.
     */
    static class Node {
        int data;
        Node next; // Next node

        //* Constructor
        Node(int data) {
            this.data = data;
            this.next = null; // Mark the end of the linked list.
        }
    }
}
