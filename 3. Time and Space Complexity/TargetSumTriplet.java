
// 1 9 6 4 8 3 12 14 24 10 15
// 25
// n^2
import java.util.*;
import java.util.Arrays.*;

public class TargetSumTriplet {

  public static void main(String[] args) {
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    int target = 25;
    int[] arr = { 1, 9, 6, 4, 8, 3, 12, 14, 24, 10, 15 };

    Arrays.sort(arr); // nlogn

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " "); // 1 3 4 6 8 9 10 12 14 15 24
    }

    for (int i = 0; i < arr.length; i++) {
      int newTarget = target - arr[i];

      int j = i + 1;
      int k = arr.length - 1;
      while (j < k) {
        if (arr[j] + arr[k] > newTarget) {
          k--;
        } else if (arr[j] + arr[k] < newTarget) {
          j++;
        } else {
          System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
          k--;
          j++;
          // break;
        }
      }

    }

  }
}