// O(nlogn)
import java.util.*;
public class Q13_MergeSort {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 8
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    // [90 60 50 10 30 20 40 70]

    int[] ans = mergeSort(arr, 0, arr.length - 1); // 0 7
    for (int i = 0; i < ans.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // index mai sb kuch kar rhe bas base case mai uss index ko use kar le rhe taki new arr return kar ske
  public static int[] mergeSort(int[] arr, int lo, int hi) { // 0 7
    if (lo == hi) { // at 0 0 and 1 1, lo hi are equal
      int[] newarr = new int[1];
      newarr[0] = arr[lo];
      return newarr; // [90] [60]
    }

    int mid = (lo + hi) / 2; // 3, 1, 0

    int[] fsh = mergeSort(arr, lo, mid); // 0 3, 0 1, 0 0
    int[] ssh = mergeSort(arr, mid + 1, hi); // 4 7, 2 3, 1 1
    int[] fsa = mergeTwoSortedArrays(fsh, ssh);

    return fsa;
  }

  // base case se fsh mai [90] and ssh mai [60] aa rha 
  // jo ki array hai
  // mergeTwoSortedArrays se [60 90] return hoga 
  public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

    int[] ans = new int[one.length + two.length];

    // int i = 0, j = 0, k = 0;
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < one.length && j < two.length) {
      if (one[i] < two[j]) {
        ans[k] = one[i];
        i++;
        k++;
      } else {
        ans[k] = two[j];
        j++;
        k++;
      }
    }

    while (j < two.length) {
      ans[k] = two[j];
      j++;
      k++;
    }
    while (i < one.length) {
      ans[k] = one[i];
      i++;
      k++;
    }

    return ans;
  }

}
