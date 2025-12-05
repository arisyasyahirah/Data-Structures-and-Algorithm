public class Node {

    public String data1;
    Node next;

    // Default constructor
    public Node() {
        this.data1 = "";
        this.next = null;
    }

    // Constructor for the node
    public Node(String d1) {
        this.data1 = d1;
        this.next = null;
    }

    public void printMyLinkedList() {
        System.out.println("Data1: " + data1);
    }
}
