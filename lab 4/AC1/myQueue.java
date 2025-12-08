public class myQueue {
    
    public static void main(String[] args) {
        CharQueue myQueue = new CharQueue(10);

        myQueue.enqueue('a');
        myQueue.enqueue('b');
        myQueue.enqueue('c');
        myQueue.enqueue('d');
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue('e');
        myQueue.enqueue('f');
        myQueue.enqueue('g');
        myQueue.enqueue('h');
        myQueue.enqueue('i');
        myQueue.enqueue('j');
        myQueue.enqueue('k');


        System.out.println("First element in queue: "+myQueue.peek());
        System.out.println("Queue elemnts: "+myQueue.toString());
        
    }
}
