// [1,4,20,3,10,5], sum=33

import java.util.*;
import java.util.Arrays;

public class sumArray {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 20, 3, 10, 5, 13, 7, 10, 15, 8};
    int sum = 33;

    Arrays.sort(arr); // 1 3 4 5 10 20
    // for(int i = 0; i < arr.length; i++){
    //   System.out.print(arr[i] + " ");
    // }

    for (int i = 0; i < arr.length; i++) { // 0, 1, 2, 3, 4, 5
      int newSum = sum - arr[i]; // 30
      // for (int j = 1 + i; j < arr.length; j++) { // 1-5, 2-5, 3-5, 4-5, 5-5
        int left = i+1;
        int right = arr.length - 1;
        while (left < right) {
          if (arr[left] + arr[right] == newSum) {
            System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
            break;
          } else if (arr[left] + arr[right] < newSum) {
            left++;
          } else if (arr[left] + arr[right] > newSum) {
            right--;
          }
        }

      // }
    }
  }
}

// 3 10 20
// 5 8 20
// 8 10 15
// 10 10 13