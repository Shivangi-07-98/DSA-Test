import java.util.*;
public class Q18_Sort012 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 8
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 1 2 0 1 2 0 1 2
    } // 2 0 1

    sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void sort(int[] arr) {
    int i = 0;
    int j = 0;
    int k = arr.length - 1;

    while (i <= k) {
      if (arr[i] == 0) {
        swap(arr, i, j);
        i++;
        j++;
      } else if (arr[i] == 1) {
        i++;
      } else if (arr[i] == 2) {
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
