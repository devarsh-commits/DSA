package DSA;
class LinkedListTraversal {

    // Node class (represents each element)
    static class Node {
        int data;      // value stored
        Node next;     // reference to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head;

    // Method to add node at end (for testing traversal)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 🔹 Traversal method
    public void traverse() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked List is empty");
            return;
        }

        System.out.print("Linked List elements: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        LinkedListTraversal list = new LinkedListTraversal();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.traverse();   // Call traversal
    }
}

