// 
import java.util.*;
public class Q23_SortDates {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 3
    String[] arr = new String[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.next();
      // String str = scn.next(); // 13051997 25041997 13071997
      // arr[i] = str;
    }
    SortDates(arr);
    print(arr);
  }

  public static void SortDates(String[] arr) { // call in sorting order
    // dates
    CountSort(arr, 1000000, 100, 32); // 0 to 31 indexes in farr
    // month
    CountSort(arr, 10000, 100, 13); // 0 to 12 indexes in farr
    // year
    CountSort(arr, 1, 10000, 2501); // 0 to 2500 indexes in farr
  }

  public static void CountSort(String[] arr, int div, int mod, int range) {
    int[] farr = new int[range];
    String[] ans = new String[arr.length];

    // collecting the frequencies
    for (int i = 0; i < arr.length; i++) {
      int val = Integer.parseInt(arr[i]) / div % mod;
      farr[val]++;
    }

    // convert freq to prefix sum array psa
    for (int i = 1; i < farr.length; i++) {
      farr[i] = farr[i] + farr[i - 1];
    }

    // fill the ans
    for (int i = arr.length - 1; i >= 0; i--) {
      int val = Integer.parseInt(arr[i]) / div % mod;
      int pos = farr[val];
      ans[pos - 1] = arr[i];
      farr[val]--;
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = ans[i];
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
