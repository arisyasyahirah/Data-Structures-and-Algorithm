// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Random;

public class selectionsort {
   public selectionsort() {
   }

   static void selectionSort(int[] arr) {
      int n = arr.length;

      for(int i = 0; i < n - 1; ++i) {
         int min_indx = i;

         int j;
         for(j = i + 1; j < n; ++j) {
            if (arr[j] < arr[min_indx]) {
               min_indx = j;
            }
         }

         j = arr[i];
         arr[i] = arr[min_indx];
         arr[min_indx] = j;
      }

   }

   static void printArray(int[] arr) {
      int[] var1 = arr;
      int var2 = arr.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int val = var1[var3];
         System.out.print("" + val + " ");
      }

      System.out.println();
   }

   public static void main(String[] args) {
      long start = System.currentTimeMillis();
      int n = 10000;
      int[] arr = new int[n];
      Random random = new Random();
      selectionsort SS = new selectionsort();

      for(int i = 0; i < n; ++i) {
         arr[i] = random.nextInt(10000);
      }

      System.out.print("unsorted array (10000 int): ");
      printArray(arr);
      selectionSort(arr);
      System.out.print("sorted array (10000 int): ");
      printArray(arr);
      long end = System.currentTimeMillis();
      System.out.println("Sorting takes " + (end - start) + "ms");
   }
}
