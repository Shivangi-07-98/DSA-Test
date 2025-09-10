// O(n^2)
import java.util.*;
public class Q3_InsertionSort {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    // Insertion Sort: Take element and insert it in correct position in sorted part
    for (int i = 1; i < arr.length; i++) { // 1, 2, 3, 4
      for (int j = i - 1; j >= 0; j--) { // 0-0, 1-0, 2-0, 3-0
        // 1(0-0) 2(1-0) 3(2-0) 4(3-0)
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        } else {
          break;
        }
      }
    }

    // Print sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}