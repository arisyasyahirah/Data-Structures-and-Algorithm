import java.util.ArrayDeque;
import java.util.Deque;

public class PhoneBookDemo {
    public static void main(String[] args) {
        // Using Deque (as both stack and queue)
        Deque<PhoneBook> phoneDeque = new ArrayDeque<>();
        
        // Using ArrayDeque as a regular queue
        ArrayDeque<PhoneBook> phoneQueue = new ArrayDeque<>();

        // Insert records into both data structures
        PhoneBook record1 = new PhoneBook(1, "Pendaftar UMT", "096684342");
        PhoneBook record2 = new PhoneBook(2, "Jabatan Pengurusan Akademi UMT", "096684219");
        PhoneBook record3 = new PhoneBook(3, "Fakulti Teknologi Kejuruteraan Kelautan dan Informatik", "096683220");

        // Add to deque (as stack - LIFO)
        phoneDeque.push(record1);
        phoneDeque.push(record2);
        phoneDeque.push(record3);
        
        // Add to queue (FIFO)
        phoneQueue.add(record1);
        phoneQueue.add(record2);
        phoneQueue.add(record3);
        
        // Display records from Deque
        System.out.println("=== DEQUE RECORDS (LIFO) ===");
        for (PhoneBook record : phoneDeque) {
            System.out.println("ID: " + record.getId() + ", Name: " + record.getName() + ", Phone: " + record.getPhoneNumber());
        }
        
        // Display records from Queue
        System.out.println("\n=== QUEUE RECORDS (FIFO) ===");
        for (PhoneBook record : phoneQueue) {
            System.out.println("ID: " + record.getId() + ", Name: " + record.getName() + ", Phone: " + record.getPhoneNumber());
        }
        
        // === BONUS TASK: SEARCH FUNCTION ===
        System.out.println("\n=== BONUS: SEARCH FUNCTION ===");
        searchPhoneNumber(phoneDeque, "Pendaftar"); // Example: user enters "Pendaftar"
    }
    
    // BONUS: Search function to retrieve record by name
    public static void searchPhoneNumber(Deque<PhoneBook> phoneBook, String searchName) {
        System.out.println("Searching for: '" + searchName + "'");
        
        boolean found = false;
        for (PhoneBook record : phoneBook) {
            if (record.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println("MATCH FOUND: " + record.getPhoneNumber()); // Displays "096684342"
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("✗ No records found for: " + searchName);
        }
    }
}