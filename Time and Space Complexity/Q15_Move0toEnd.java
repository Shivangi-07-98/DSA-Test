import java.util.*;
public class Q15_Move0toEnd {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 7
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 9 5 0 4 8 0 2
    }
    // sort(arr);
    mySort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void mySort(int[] arr) {
    int i = arr.length - 1;
    int j = arr.length - 1;
    while (j >= 0) {
      if (arr[j] == 0) {
        swap(arr, i, j);
        i--;
        j--;
      } else {
        j--;
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
