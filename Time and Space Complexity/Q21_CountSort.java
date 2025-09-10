// 3n + range = n + range
// in array find min and max and find its range (max-min)+1 = (7-2)+1 = 5+1 = 6
// min max range
// make 6 size freq array to store freq using range (to store freq of array elements minus min)
// prefix sum array
// answer array same as original array

import java.util.*;
public class Q21_CountSort {
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 13
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 5 3 7 3 5 7 2 5 2 7 6 5 6
    }

    int min = scn.nextInt(); // 2
    int max = scn.nextInt(); // 7
    countSort(arr, min, max);
    print(arr);
  }

  public static void countSort(int[] arr, int min, int max) {
    int range = max - min + 1;
    int[] farr = new int[range];
    int[] ans = new int[arr.length];

    // collecting the frequencies O(n)
    for (int i = 0; i < arr.length; i++) {
      int val = arr[i];
      farr[val - min]++;
    }

    // convert freq to prefix sum array psa O(range)
    for (int i = 1; i < farr.length; i++) {
      farr[i] = farr[i] + farr[i - 1];
    }

    // fill the ans O(n)
    for (int i = arr.length - 1; i >= 0; i--) {
      int val = arr[i];
      int pos = farr[val - min];
      ans[pos - 1] = val;
      farr[val - min]--;
    }

    // fill the original array O(n)
    for (int i = 0; i < ans.length; i++) {
      arr[i] = ans[i];
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
