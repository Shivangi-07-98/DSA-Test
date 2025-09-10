// O(n^2)
import java.io.*;
import java.util.*;

public class Q1_BubbleSort {
  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 5
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    // Bubble Sort: Compare next element and swap, largest element reaches the end of the array
    for (int i = 1; i < n; i++) { // 1, 2, 3, 4
      for (int j = 0; j <= n - 1 - i; j++) { // 0-3, 0-2, 0-1, 0-0
        // 1(0-3) 2(0-2) 3(0-1) 4(0-0)
        if (arr[j + 1] < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // Print sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}