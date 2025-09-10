import java.util.*;
public class Q17_PartitionAnArray {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 6
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 4 11 6 2 8 9
    }

    // move less than equal to pivot in front
    int pivot = scn.nextInt(); // 5
    PartitioningAnArray(arr, pivot); // 4 2 6 11 8 9
    // PreserveOrderPartitioningAnArray(arr, pivot); // 4 2 11 6 8 9

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void PartitioningAnArray(int[] arr, int pivot) {
    int i = 0;
    int j = 0;
    while (j < arr.length) {
      if (arr[j] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        j++;
      }
    }
  }

  public static void PreserveOrderPartitioningAnArray(int[] arr, int pivot) {
    int i = arr.length - 1;
    int j = arr.length - 1;
    while (j >= 0) {
      if (arr[j] > pivot) {
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
