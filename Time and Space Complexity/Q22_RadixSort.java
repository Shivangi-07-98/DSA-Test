// O(d(n)) = d is max no. digit
import java.util.*;
public class Q22_RadixSort {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 7
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 2583 9462 999 5193 7246 4381 5454
    }
    RadixSort(arr);
    print(arr);
  }

  public static void RadixSort(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) { // O(n)
      if (arr[i] > max) {
        max = arr[i];
      }
    } // to sort these types of array 9 47 383 4674

    int place = 1;
    while (max / place > 0) { // O(d(n+r))
      CountSort(arr, place); // 1, 10, 100, 1000, 10000 ...
      place = place * 10;
    }
  }

  // O(n + r)
  public static void CountSort(int[] arr, int exp) {
    int[] farr = new int[10]; // because we are sorting on digits
    int[] ans = new int[arr.length];

    // collecting the frequencies
    for (int i = 0; i < arr.length; i++) {
      int val = arr[i] / exp % 10;
      farr[val]++;
    }

    // convert freq to prefix sum array psa
    for (int i = 1; i < farr.length; i++) {
      farr[i] = farr[i] + farr[i - 1];
    }

    // fill the ans
    for (int i = arr.length - 1; i >= 0; i--) {
      int val = arr[i] / exp % 10;
      int pos = farr[val];
      ans[pos - 1] = arr[i];
      farr[val]--;
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = ans[i];
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
