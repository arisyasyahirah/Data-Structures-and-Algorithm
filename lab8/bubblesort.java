import java.util.Random;

public class bubblesort {
        static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    
    public static void main(String[] args) {
      long start = System.currentTimeMillis();
      int n = 10000;
      int[] arr = new int[n];
      Random random = new Random();
      bubblesort SS = new bubblesort();

      for(int i = 0; i < n; ++i) {
         arr[i] = random.nextInt(10000);
      }

      System.out.print("unsorted array (10000 int): ");
      printArray(arr, n);
      bubbleSort(arr, n);
      System.out.print("sorted array (10000 int): ");
      printArray(arr, n);
      long end = System.currentTimeMillis();
      System.out.println("Sorting takes " + (end - start) + "ms");
   }
}
