public class LinkedList {
    private Node first;
    private Node last;

    // Default constructor
    public LinkedList() {
        first = null;
        last = null;
    }

    // Check if empty
    public boolean isEmpty() {
        return first == null;
    }

    // Add at the beginning
    public void addFirst(String d1) {
        Node node = new Node(d1);
        node.next = first;
        first = node;
        if (last == null) {
            last = node;
        }
    }

    // Add at the end
    public void addLast(String d1) {
        Node node = new Node(d1);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    // Add at specific index
    public void add(int index, String d1) {
        if (index == 0) {
            addFirst(d1);
            return;
        }

        Node newNode = new Node(d1);
        Node current = first;

        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove first node
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        first = first.next;
        if (first == null) {
            last = null;
        }
    }

    // Remove last node
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (first.next == null) {
            first = null;
            last = null;
            return;
        }

        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        last = current;
    }

    // Reverse list
    public void reverse() {
        Node prev = null;
        Node current = first;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        first = prev;
    }

    // Print the list
    public void printList() {
        Node current = first;
        while (current != null) {
            current.printMyLinkedList();
            current = current.next;
        }
        System.out.println("End of Linked List\n");
    }
}
