public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addFirst("e");
        list.printList();

        list.removeLast();
        list.printList();

        list.add(2, "f");
        list.printList();

        list.addLast("g");
        list.printList();

        list.removeFirst();
        list.printList();

        list.reverse();
        list.printList();
    }
}
