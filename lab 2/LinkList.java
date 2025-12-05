    public class LinkList {
    private Node first;

    //LinkList constructor
    public LinkList(){
        first = null;
    }
    //returnd true if the linkeed list is empty
    public boolean isEmpty(){
        return first == null;
    }

    //inserts a new node at the first of the  linked list
    public void addFirst (int d1, double d2){
        Node node = new Node(d1,d2);
        node.next = first;
        first = node;
    }



    //deletes the node at the firt of the linked list
    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    //prints ;linked list data
    public void printList(){
            Node currentNode = first;
            System.out.print("List: ");

            while(currentNode != null){
                currentNode.printNode();
                currentNode = currentNode.next;
        }
                System.out.println(" ");
}
}
