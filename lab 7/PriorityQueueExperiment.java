

import java.util.NoSuchElementException;

public class PriorityQueueExperiment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test MyPriorityQueue Class here.
        // Try with 7 integers, any integers
        
        System.out.println("=== Testing MyPriorityQueue Implementation ===\n");
        
        // Create a priority queue
        MyPriorityQueue pq = new MyPriorityQueue();
        
        // Enqueue 7 integers
        System.out.println("Enqueuing 7 integers: 15, 5, 25, 10, 3, 20, 8");
        pq.enqueue(15);
        pq.enqueue(5);
        pq.enqueue(25);
        pq.enqueue(10);
        pq.enqueue(3);
        pq.enqueue(20);
        pq.enqueue(8);
        
        System.out.println("\n--- Queue Status ---");
        System.out.println("Size: " + pq.size());
        System.out.println("Is empty: " + pq.isEmpty());
        System.out.println("Peek (highest priority): " + pq.peek());
        
        System.out.println("\n--- Contains Check ---");
        System.out.println("Contains 10: " + pq.contains(10));
        System.out.println("Contains 30: " + pq.contains(30));
        System.out.println("Contains 3: " + pq.contains(3));
        
        System.out.println("\n--- Dequeue Operations ---");
        System.out.println("Dequeue: " + pq.dequeue());
        System.out.println("Peek after dequeue: " + pq.peek());
        System.out.println("Size after dequeue: " + pq.size());
        
        System.out.println("\nDequeue: " + pq.dequeue());
        System.out.println("Peek after dequeue: " + pq.peek());
        
        System.out.println("\n--- Dequeue All Remaining ---");
        System.out.print("Remaining elements in priority order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.dequeue() + " ");
        }
        
        System.out.println("\n\nFinal size: " + pq.size());
        System.out.println("Is empty: " + pq.isEmpty());
        
        System.out.println("\n=== Test Complete ===");
        
        // Test exception handling
        try {
            System.out.println("\nTrying to peek from empty queue:");
            pq.peek();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        
        try {
            System.out.println("Trying to dequeue from empty queue:");
            pq.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}