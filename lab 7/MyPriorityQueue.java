import java.util.NoSuchElementException;

public class MyPriorityQueue {

    private int[] innerArray;
    private int size;

    public MyPriorityQueue() {
        this.innerArray = new int[10];
        size = 0;
    }

    public void enqueue(int x) {
        // If it is empty, insert in front
        if (size == 0) {
            size++;
            innerArray[0] = x;
            return;
        }
        // If full, we'll have to double the array
        if (size() == innerArray.length) {
            doubleArray();
        }
        // Looping through
        int temp = x;
        for (int i = 0; i < size; i++) {
            // If priority is higher, ie. values is lower, we shift.
            if (x <= innerArray[i]) {
                int next;
                temp = innerArray[i];
                innerArray[i] = x;
                // Shifting
                while (i < size - 1) {
                    next = innerArray[i + 1];
                    innerArray[i + 1] = temp;
                    temp = next;
                    i++;
                }
                break;
            }
        }
        // Placing, increasing size.
        innerArray[size] = temp;
        size++;
    }

    public int dequeue() {
        // NoSuchElement
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty");
        }
        // Storing first int for return
        int retValue = innerArray[0];
        // Shifting all values downwards
        for (int i = 1; i < size; i++) {
            innerArray[i - 1] = innerArray[i];
        }
        innerArray[size - 1] = 0;
        size--;
        return retValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty");
        }
        return innerArray[0];
    }

    public boolean contains(int x) {
        // Check for empty.
        if (isEmpty()) {
            return false;
        }
        // Looping through the positions which contains inserted values,
        // ignoring trailing default 0 values.
        for (int i = 0; i < size; i++) {
            // Comparing
            if (innerArray[i] == x) {
                return true;
            }
        }
        // None found
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void doubleArray() {
        int[] newArray = new int[innerArray.length * 2];
        for (int i = 0; i < innerArray.length; i++) {
            newArray[i] = innerArray[i];
        }
        innerArray = newArray;
    }
}