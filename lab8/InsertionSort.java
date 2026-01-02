import java.util.Random;

public class InsertionSort {
   public InsertionSort() {
   }

   void sort(int[] arr) {
      int n = arr.length;

      for(int i = 1; i < n; ++i) {
         int key = arr[i];

         int j;
         for(j = i - 1; j >= 0 && arr[j] > key; --j) {
            arr[j + 1] = arr[j];
         }

         arr[j + 1] = key;
      }

   }

   static void printArray(int[] arr) {
      int n = arr.length;

      for(int i = 0; i < n; ++i) {
         System.out.print(arr[i] + " ");
      }

      System.out.println();
   }

   public static void main(String[] args) {
      long start = System.currentTimeMillis();
      int n = 10000;
      int[] arr = new int[n];
      Random random = new Random();
      InsertionSort IS = new InsertionSort();

      for(int i = 0; i < n; ++i) {
         arr[i] = random.nextInt(10000);
      }

      System.out.print("unsorted array (10000 int): ");
      printArray(arr);
      IS.sort(arr);
      System.out.print("sorted array (10000 int): ");
      printArray(arr);
      long end = System.currentTimeMillis();
      System.out.println("Sorting takes " + (end - start) + "ms");
   }
}
