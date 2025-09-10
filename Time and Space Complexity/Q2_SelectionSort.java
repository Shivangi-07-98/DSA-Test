// O(n^2)
import java.io.*;
import java.util.*;

public class Q2_SelectionSort {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 5
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    // Selection Sort: Find smallest element and put it at start by swapping,
    // smallest element reaches the start of the array
    // Diff from Bubble: Bubble swaps adjacent, Selection finds min and swaps
    for (int i = 0; i <= n - 2; i++) { // 0, 1, 2, 3
      int minidx = i;
      for (int j = i + 1; j <= n - 1; j++) { // 1-4, 2-4, 3-4, 4-4
        // 0(1-4) 1(2-4) 2(3-4) 3(4-4)
        if (arr[j] < arr[minidx]) { // find smaller element
          minidx = j;
        }
        // IMPORTANT: arr[minidx] use karo, arr[i] nahi!
        // arr[i] se compare karne par last element mil jayega, smallest nahi
      }
      // swap smallest element to correct position
      int temp = arr[i];
      arr[i] = arr[minidx];
      arr[minidx] = temp;
    }

    // Print sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

// for n = 5, 0 index ko small mankar, hum 1-4 mai search krenge koi aur chhota
// hai kya? agar hai toh swap
// aage saare sort hote jayenge
// but ek loop mai ek hi sort hoga issiliye O(n2)
