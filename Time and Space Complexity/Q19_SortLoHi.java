import java.util.*;
public class Q19_SortLoHi {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int lo = scn.nextInt(); // 8
    int hi = scn.nextInt(); // 11

    int n = scn.nextInt(); // 10
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 5 9 6 18 14 3 12 7 4 10
    }

    sort(arr, lo, hi); // 
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void sort(int[] arr, int lo, int hi) {
    int i = 0;
    int j = 0;
    int k = arr.length - 1;

    while (i <= k) {
      if (arr[i] < lo) {
        swap(arr, i, j);
        i++;
        j++;
      } else if (arr[i] >= lo && arr[i] <= hi) {
        i++;
      } else {
        swap(arr, i, k);
        k--;
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
